package com.star.SpringBootWeb1;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("index");
        System.out.println("home method called");
        return mv;
    }

    @RequestMapping("/Add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        //But we can still simplify this code..
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//       int num2 = Integer.parseInt(req.getParameter("num2"));

       int result = num1 + num2;

//       session.setAttribute("Answer", result);

//         model.addAttribute("Answer", result);

        mv.addObject("Answer", result);
        mv.setViewName("result");

//        System.out.println(result);

//        System.out.println("in add");

//        return "result";
        return mv;
    }

    @RequestMapping("/AddAlien")
    public String AddAlien(Alien alien) {


        return "result";
    }




}
