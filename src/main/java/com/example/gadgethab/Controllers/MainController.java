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
        return "main";
    }

    @GetMapping("/shop.html")
    public String shop(Model model)
    {
        model.addAttribute("title", "Магазин");
        return "shop";
    }

    @GetMapping("/about.html")
    public String about(Model model)
    {
        model.addAttribute("title", "О компании");
        return "about";
    }

    @GetMapping("/contact.html")
    public String contact(Model model)
    {
        model.addAttribute("title", "Контакты");
        return "contact";
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
        return "cart.html";
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

    @GetMapping("/console.html")
    public String console(Model model)
    {
        model.addAttribute("title", "Консоли");
        return "console";
    }

    @GetMapping("/games.html")
    public String games(Model model)
    {
        model.addAttribute("title", "Игры");
        return "games";
    }

    @GetMapping("/headphones.html")
    public String headphones(Model model)
    {
        model.addAttribute("title", "Наушники");
        return "headphones";
    }

    @GetMapping("/laptop.html")
    public String laptop(Model model)
    {
        model.addAttribute("title", "Ноутбуки");
        return "laptop";
    }

    @GetMapping("/microphone.html")
    public String microphone(Model model)
    {
        model.addAttribute("title", "Микрофоны");
        return "microphone";
    }

    @GetMapping("/pc.html")
    public String pc(Model model)
    {
        model.addAttribute("title", "Комплектующие");
        return "pc";
    }

    @GetMapping("/smartphones.html")
    public String smartphones(Model model)
    {
        model.addAttribute("title", "Смартфоны");
        return "smartphones";
    }

    @GetMapping("/vr.html")
    public String vr(Model model)
    {
        model.addAttribute("title", "Виртуальная реальность");
        return "vr";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("title", "Тестовая страница");
        return "test";
    }

}
