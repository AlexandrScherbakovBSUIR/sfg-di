package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final String PHRASE = "HI GAYS!";

    public String sayHi(){
        System.out.println(PHRASE);
        return "It's my first words!";
    }


}
