package com.example.springbasic.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/hi")
    public String sayHello(){
        return "Hello Coders";
    }

    @GetMapping("/hello")
    public String sayHello2(){
        return "Hello new  Coders";
    }

    @GetMapping("/usd_to_inr")
    public int convertToINR(@RequestParam int q) {
        int usd = q;
        return 75*usd;
    }

    @GetMapping("/user")
        public User getUser() {
            User user = new User (1, "Harshit",25);
            return user;
        }

   /* @PostMapping("/users")
    public boolean createAUser (@RequestBody User user){

    }*/

}
