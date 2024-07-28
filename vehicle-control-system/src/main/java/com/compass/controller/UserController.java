package com.compass.controller;

import com.compass.interfaces.UserRepository;
import com.compass.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Retorna a página de registro (register.html)
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        // Verifica se o usuário já existe
        if (userRepository.findByUsername(username) != null) {
            model.addAttribute("error", "Username already exists");
            return "register"; // Retorna à página de registro com erro
        }

        // Criptografa a senha
        String encodedPassword = passwordEncoder.encode(password);
        
        // Cria um novo usuário
        User newUser = new User(username, encodedPassword);
        userRepository.save(newUser); // Salva o usuário no banco de dados

        return "redirect:/login"; // Redireciona para a página de login após o registro
    }
}