package com.tistory.hitomis.springbootjartest.controller;

import com.tistory.hitomis.springbootjartest.vo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String validCheckForm(@Valid Greeting greeting, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "greeting";
        }

        model.addAttribute("greeting", greeting);
        return "result";

    }

}
