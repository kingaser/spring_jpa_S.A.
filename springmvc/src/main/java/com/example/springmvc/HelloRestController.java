package com.example.springmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class HelloRestController {

    @GetMapping("/json/string")
    public String helloHelloString() {
        return "<html><body>Hello @ResponseBody</body></heml>";
    }

    @GetMapping("/json/list")
    public List<String> helloJson() {
        List<String> words = Arrays.asList("Hello", "Controller");

        return words;
    }
}
