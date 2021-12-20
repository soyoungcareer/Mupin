package com.mupin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/main")
    public String index(){
        System.out.println("hi");
        return "/layouts/main";
    }
}
