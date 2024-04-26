package ru.itis.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.demo.service.UserService;

//@RestController
//public class BanUsersController {
//
//    private final UserService userService;
//
//    @Autowired
//    public BanUsersController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/banAll")
//    public String banAllUsers() {
//        userService.banAllUsers();
//        System.out.println("post request done");
//        return "allUsers";
//    }
//}
