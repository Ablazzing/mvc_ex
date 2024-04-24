package org.javaacademy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @GetMapping
    public String getTest(Model model) {
        model.addAttribute("shopname", "Petrovich");
        return "shop";
    }

    @GetMapping("/price")
    public String getPrice() {
        return "price";
    }
}
