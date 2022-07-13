package it.develhope.Swagger02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DefaultController {
    @GetMapping("")
    public String welcome() {
        return "Welcome on the page";
    }
}
