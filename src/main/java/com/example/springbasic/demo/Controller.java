package com.example.springbasic.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    DB db = new DB();

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
   // create a new user
   @PostMapping("/users")
    public boolean createAUser (@RequestBody User user){
      return db.addAUser(user);
    }

    @GetMapping("/getAllUsers")
     public List<User> getAllUsers(){
        return db.getAllUsers();
    }

    // search a user by user_id
    @GetMapping("/serach/users")
    public User findUser(@RequestParam int id){
        return db.findUser(id);
    }

    @GetMapping("/serach/users/{id}")
    public User findUserUsingPath(@PathVariable int id){
        return db.findUser(id);
    }

    @PutMapping("/users")
    public boolean  updateAUser(@RequestBody User user){
         return db.updateAUser(user);
    }

}
