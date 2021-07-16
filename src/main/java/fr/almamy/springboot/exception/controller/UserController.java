package fr.almamy.springboot.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class UserController {
    @RequestMapping("/add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    @RequestMapping("update")
    public String update() {
        String caper = null;
        caper.toLowerCase(Locale.ROOT);
        return "update";
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView handlerNullPointerException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("nullPointer");
        return modelAndView;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handlerArithmeticException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("mathError");
        return modelAndView;
    }
}
