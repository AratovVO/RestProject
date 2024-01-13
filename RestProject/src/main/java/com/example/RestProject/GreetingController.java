package com.example.RestProject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController { // демонстрационный контроллер
    @GetMapping
    public String greet(@RequestParam("name") String name){
        return "Hello, " + name;
    }
    @GetMapping("/full")
    public String fullGreeting(@RequestParam("name") String name,
                               @RequestParam("surname")String surname){
        return "Nice to meet you, " + name + " " + surname;
    }
    @GetMapping("/{name}/{surname}")

    public String greetWithPathVariable(@PathVariable("name") String name,
                                        @PathVariable("name") String surname){
    return "Hello, " + name + " " + surname;
    }
}
