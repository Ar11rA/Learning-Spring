package com.example.jokesapp.controllers;

import com.example.jokesapp.services.IJokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private IJokesService jokesService;

    @Autowired
    public JokeController(IJokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
