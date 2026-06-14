package com.star.SpringBootWeb1;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("/Add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

        //But we can still simplify this code..
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//       int num2 = Integer.parseInt(req.getParameter("num2"));

       int result = num1 + num2;

//       session.setAttribute("Answer", result);

         model.addAttribute("Answer", result);


//        System.out.println(result);

//        System.out.println("in add");

        return "result";
    }

}
