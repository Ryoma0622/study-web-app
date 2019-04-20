package study.web.startApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloContoller {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("message","Hello! ThymeLeaf!!!");
        return "hello";
    }
}
