package com.dilan.ims.service.controllers;

import com.dilan.ims.service.domain.User;
import com.dilan.ims.service.services.UserService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private UserService userService;

    @Autowired
    public void setUserService(UserService userServicea) {
        this.userService = userServicea;
    }


    @GetMapping(value = "/")
    public ResponseEntity<List<User>> getUsers() {
        LOGGER.info("test ok");
        List<User> users = userService.getAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PostMapping(value = "/add",produces = "application/json")
    public ResponseEntity<User> insertUser(@RequestBody String userJSONString){
        Gson gson = new Gson();
        LOGGER.warn("Receive User : {}", userJSONString);
        JsonElement jelement = new JsonParser().parse(userJSONString);
        JsonObject user = jelement.getAsJsonObject();


        User c = gson.fromJson(userJSONString, new TypeToken<User>(){}.getType());
       // list.forEach(x -> System.out.println(x));

        User d = userService.isUserExist(user.get("name").getAsString());
        if (d != null) {
            LOGGER.warn("Unable to create. A User with name {} already exist", user.get("name").getAsString());
            return new ResponseEntity("try",HttpStatus.CONFLICT);
        }

        return new ResponseEntity<User>( userService.saveUser(c), HttpStatus.CREATED);
    }

}
