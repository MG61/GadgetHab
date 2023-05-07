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

    @GetMapping("/main.html")
    public String home(Model model)
    {
        model.addAttribute("title", "Главная страница");
        return "main";
    }

    @GetMapping("/shop.html")
    public String shop(Model model)
    {
        model.addAttribute("title", "Магазин");
        return "shop";
    }

    @GetMapping("/blog.html")
    public String blog(Model model)
    {
        model.addAttribute("title", "Блог");
        return "blog";
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
