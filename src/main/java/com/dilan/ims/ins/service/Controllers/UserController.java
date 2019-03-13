package com.dilan.ims.ins.service.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping(value = "/")
    public String getUsers() {
        LOGGER.info("test ok");
        return "test";
    }

}
