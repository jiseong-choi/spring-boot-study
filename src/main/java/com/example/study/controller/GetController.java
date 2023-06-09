package com.example.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
// root controller class 를 감싸는 annotation
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest() {
        return "Hi getMethod";
    }
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String password) {
        System.out.println("id: " + id);
        System.out.println("password: " + password);

        return id + password;
    }
}
