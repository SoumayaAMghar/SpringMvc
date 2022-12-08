package com.example.skillstree.contoller;

import com.example.skillstree.dao.ApprenantDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")

public class ApprenantController {
    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/login")
    public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password){

        ApprenantDao apprenantDao = new ApprenantDao();
        boolean  login = apprenantDao.login(email,password);

        ModelAndView modalAndView = new ModelAndView();
        if(login){
            modalAndView.setViewName("index");
        }
        else {
            modalAndView.setViewName("login");
        }
        return modalAndView;
    }
}
