package com.example.demo12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
     @GetMapping("/hello")
     public String demo() {
        return "Its demo message from micro service";
}
}
