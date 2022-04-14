package org.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }
    @PostMapping("/processForm")
    public String processForm(HttpServletRequest request, Model theModel)
    {
        String name=request.getParameter("name").toString();
        theModel.addAttribute("NAME",name);
        return "helloworld";
    }
}
