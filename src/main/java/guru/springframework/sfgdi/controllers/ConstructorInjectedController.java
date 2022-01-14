package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingService;

public class ConstructorInjectedController {
    private final GreedingService greedingService;

    public ConstructorInjectedController(GreedingService greedingService) {
        this.greedingService = greedingService;
    }

    public String getGreeding() {
        return greedingService.sayGreeding();
    }
}
