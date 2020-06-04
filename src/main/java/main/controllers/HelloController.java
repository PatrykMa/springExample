package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/teste")
    public String index() {
        try {
            return "Greetings from Spring Boot!";
        }catch (Exception e){
            int x=0;
            x=1;
        }
        return "Greetings from Spring Boot!";
    }

}
