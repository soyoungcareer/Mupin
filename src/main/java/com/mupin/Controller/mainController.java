package com.mupin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/example")
    public String index(){
        return "/layouts/example";
    }
    @GetMapping("/order")
    public String order(){
        return "/layouts/order";
    }
}
