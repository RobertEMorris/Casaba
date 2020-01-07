package org.robmorris.casaba.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 **Code lifted from https://www.websparrow.org/spring/spring-boot-security-how-to-change-default-login-page
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }
}