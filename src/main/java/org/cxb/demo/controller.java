package org.cxb.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controller
{
    @GetMapping("/get")
    public String doGet() {
        return "Hello World!";
    }
    
}
