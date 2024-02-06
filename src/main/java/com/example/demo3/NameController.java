package com.example.demo3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/name")
    public String name(@RequestParam String name){
        return name.toString();
    }
    @PostMapping("/name-change")
    public String nameChange(@RequestParam String name){
        String nameChanged = new StringBuilder(name).reverse().toString();
        return nameChanged;
    }
}
