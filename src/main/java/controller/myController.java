package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class myController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
