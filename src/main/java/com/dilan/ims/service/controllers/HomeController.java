package com.dilan.ims.service.controllers;

/**
 * User: Dilan Salinda
 * Date: 4/8/2019
 * Time: 7:06 AM
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String login() {
        return "index";
    }

    @RequestMapping("dashboard")
    public String dashboard() {
        return "/dashboard";
    }
}