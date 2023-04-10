package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping( value = "/postMethod")
    public String postMethod(@RequestBody SearchParam searchParam) {


        return "OK";
    }
}
