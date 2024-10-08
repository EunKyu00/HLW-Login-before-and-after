package com.std.HLW;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hlw")
    public String hlw(){
        return "Login-before";
    }
    @GetMapping("/hlw/login")
    public String hlwLogin(){
        return "Login-after";
    }
    @GetMapping("/hlw/list")
    public String hlwList(){
        return "ToDo-List";
    }
}
