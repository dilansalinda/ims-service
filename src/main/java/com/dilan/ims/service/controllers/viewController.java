package com.dilan.ims.service.controllers;

import com.dilan.ims.service.domain.User;
import com.dilan.ims.service.domain.UserPermission;
import com.dilan.ims.service.services.IUserService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class viewController {

    private static final Logger LOGGER = LoggerFactory.getLogger(viewController.class);

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/checkConnection", method = RequestMethod.GET)
    public ResponseEntity<?> checkConnection() {
        HashMap<String,Boolean> stringBooleanHashMap = new HashMap<>();
        stringBooleanHashMap.put("boolean",true);
        return new ResponseEntity(stringBooleanHashMap, HttpStatus.OK);
    }

    @GetMapping(value = "/test")
    public String d() {
        return "test";
    }

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<User> getUsers(@RequestBody String credentials) {

        JsonObject user = new JsonParser().parse(credentials).getAsJsonObject();
        JsonObject userObject = user.get("user").getAsJsonObject();

        LOGGER.debug(userObject.get("username").getAsString());

        User users = userService.userLogin(userObject.get("username").getAsString(), userObject.get("password").getAsString());

        if (users.getUsername() == null) {
            return new ResponseEntity(new JsonObject(), HttpStatus.OK);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public ResponseEntity<User> insertUser(@RequestBody String userJSONString) {
        Gson gson = new Gson();
        LOGGER.warn("Receive User : {}", userJSONString);
        JsonElement jElement = new JsonParser().parse(userJSONString);
        JsonObject user = jElement.getAsJsonObject();

        User c = gson.fromJson(userJSONString, new TypeToken<User>() {
        }.getType());
        // list.forEach(x -> System.out.println(x));

        User d = userService.isUserExist(user.get("name").getAsString());
        if (d != null) {
            LOGGER.warn("Unable to create. A User with name {} already exist", user.get("name").getAsString());
            return new ResponseEntity("try", HttpStatus.CONFLICT);
        }

        return new ResponseEntity<User>(userService.saveUser(c), HttpStatus.CREATED);
    }

    @GetMapping(value = "/alluser")
    public ResponseEntity<List<UserPermission>> getAllUserPermission() {
        //List<UserPermission> userPermissions = userService.getAll();
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
