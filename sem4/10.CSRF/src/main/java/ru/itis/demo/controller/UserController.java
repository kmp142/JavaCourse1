package ru.itis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.demo.entity.User;
import ru.itis.demo.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String getAllUsers(Model model, CsrfToken token) {
        if (token != null) {
            List<User> users = userService.getAllUsers();
            model.addAttribute("users", users);
            model.addAttribute("csrf", token);
            return "allUsers";
        } else {
            return "redirect:/signIn";
        }

    }

    @GetMapping("/banAll")
    public String banAllUsersPage(Model model, CsrfToken token) {
        if (token != null) {
            model.addAttribute("csrf", token);
            return "bannedUsers";
        } else {
            return "redirect:/signIn";
        }
    }

    @PostMapping("/banAll")
    public String banAllUsers() {
        userService.banAllUsers();
        return "redirect:/all";
    }
}
