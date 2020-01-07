package org.robmorris.casaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/main")
    private String getMain(){

        return "Hello World";
    }

}
