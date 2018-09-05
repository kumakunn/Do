package org.csu.donow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        return new ModelAndView("html/login");
    }
    @GetMapping("/test")
    public String getItemView(){
        return "html/nothing";
    }
}
