package com.eastsoft.hispring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {

    @GetMapping("/hi")
    public String test(@RequestParam(value = "name", defaultValue = "world!") String name) {
        return String.format("Hello %s!", name);
    }
    @PostMapping("/hi")
    public String testPost (@RequestBody String value) {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.readValue(value, )
        System.out.println();
    return value;
    }
}
