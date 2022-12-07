package com.example.skillstree.contoller;

import com.example.skillstree.AddService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        AddService addService = new AddService();
        int k = addService.add(i,j);

        ModelAndView modalAndView = new ModelAndView();
        modalAndView.setViewName("display");
        modalAndView.addObject("result", k);

        return modalAndView;
    }
}
