package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public String WELCOME_MESSAGE;

    @GetMapping("/")
    public String sayHello() {
        return WELCOME_MESSAGE;
    }

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message) {
        WELCOME_MESSAGE = message;
    }

}