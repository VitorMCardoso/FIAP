package com.br.fiap.javaplat.exercise.controller.REST;

import com.br.fiap.javaplat.exercise.model.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GreetingController {

    private static final String msg = "Hello, ";

    public Greeting greeting(@RequestBody Greeting greetingRequest){
        return new Greeting(greetingRequest.getId(), String.format(msg + greetingRequest.getContent()));
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
}