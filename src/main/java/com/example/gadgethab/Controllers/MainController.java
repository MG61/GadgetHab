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

    @GetMapping("/category/console.html")
    public String console(Model model)
    {
        model.addAttribute("title", "Консоли");
        return "category/console";
    }

    @GetMapping("/category/games.html")
    public String games(Model model)
    {
        model.addAttribute("title", "Игры");
        return "category/games";
    }

    @GetMapping("/category/headphones.html")
    public String headphones(Model model)
    {
        model.addAttribute("title", "Наушники");
        return "category/headphones";
    }

    @GetMapping("/category/laptop.html")
    public String laptop(Model model)
    {
        model.addAttribute("title", "Ноутбуки");
        return "category/laptop";
    }

    @GetMapping("/category/microphone.html")
    public String microphone(Model model)
    {
        model.addAttribute("title", "Микрофоны");
        return "category/microphone";
    }

    @GetMapping("/category/pc.html")
    public String pc(Model model)
    {
        model.addAttribute("title", "Комплектующие");
        return "category/pc";
    }

    @GetMapping("/category/smartphones.html")
    public String smartphones(Model model)
    {
        model.addAttribute("title", "Смартфоны");
        return "category/smartphones";
    }

    @GetMapping("/category/vr.html")
    public String vr(Model model)
    {
        model.addAttribute("title", "Виртуальная реальность");
        return "category/vr";
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("title", "Тестовая страница");
        return "test";
    }

}
