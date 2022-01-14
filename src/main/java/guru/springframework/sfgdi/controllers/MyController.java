package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("primaryGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }


}
