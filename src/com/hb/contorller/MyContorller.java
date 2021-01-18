package com.hb.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyContorller {

    @RequestMapping("/add/{a}/{b}")
    public ModelAndView add(@PathVariable int a, @PathVariable int b, ModelAndView mv){
        mv.addObject("mess","结果为");

        mv.setViewName("add");
        System.out.println(a+b);
        return mv;
    }




}
