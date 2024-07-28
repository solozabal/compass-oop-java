package com.compass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Retorna a página de login (login.html)
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout"; // Redireciona para a página de login após o logout
    }
}