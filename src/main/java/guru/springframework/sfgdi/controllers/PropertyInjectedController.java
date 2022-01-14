package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingService;

public class PropertyInjectedController {

    public GreedingService greedingService;

    public String getGreeding() {
        return greedingService.sayGreeding();
    }
}
