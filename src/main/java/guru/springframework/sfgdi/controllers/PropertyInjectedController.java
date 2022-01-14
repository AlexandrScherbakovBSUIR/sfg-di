package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreedingService greedingService;

    public String getGreeding() {
        return greedingService.sayGreeding();
    }
}
