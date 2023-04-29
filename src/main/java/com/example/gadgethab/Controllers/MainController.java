package com.example.gadgethab.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gadgethab.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/auth")
    public String authorization(Model model)
    {
        model.addAttribute("title", "Страница авторизации");
        return "authorization";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("title", "Тестовая страница");
        return "test";
    }

}
