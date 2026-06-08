package com.star.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home() {
        System.out.println("home method calld");
        return "index.jsp";
    }
}
