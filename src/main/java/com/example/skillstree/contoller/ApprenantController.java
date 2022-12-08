package com.example.skillstree.contoller;

import com.example.skillstree.dao.ApprenantDao;
import com.example.skillstree.entities.ApprenantsEntity;
import com.example.skillstree.services.ApprenantService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class ApprenantController {

    private HttpSession session;

    @Autowired
    public void setSession(HttpSession session) {
        this.session = session;
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/login")
    public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password){

        ApprenantDao apprenantDao = new ApprenantDao();
        ApprenantsEntity apprenant = apprenantDao.login(email,password);
        ModelAndView modalAndView = new ModelAndView();

        if(apprenant != null){
            session.setAttribute("apprenant",apprenant);
            modalAndView.setViewName("index");
        }
        else {
            modalAndView.setViewName("login");
        }
        return modalAndView;
    }
}
