package com.example.gadgethab.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @GetMapping("/main.html")
    public String home(Model model)
    {
        model.addAttribute("title", "Главная страница");
        return "navigation/main";
    }

    @GetMapping("/shop.html")
    public String shop(Model model)
    {
        model.addAttribute("title", "Магазин");
        return "navigation/shop";
    }

    @GetMapping("/about.html")
    public String about(Model model)
    {
        model.addAttribute("title", "О компании");
        return "navigation/about";
    }

    @GetMapping("/contact.html")
    public String contact(Model model)
    {
        model.addAttribute("title", "Контакты");
        return "navigation/contact";
    }

    @GetMapping("/sproduct.html")
    public String single_product(Model model)
    {
        model.addAttribute("title", "Товар");
        return "sproduct";
    }

    @GetMapping("/cart.html")
    public String cart(Model model)
    {
        model.addAttribute("title", "Корзина");
        return "navigation/cart.html";
    }

    @GetMapping("/authorization.html")
    public String authorization(Model model)
    {
        model.addAttribute("title", "Авторизация");
        return "authorization";
    }

    @GetMapping("/registration.html")
    public String registration(Model model)
    {
        model.addAttribute("title", "Регистрация");
        return "registration";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("title", "Тестовая страница");
        return "test";
    }

}
