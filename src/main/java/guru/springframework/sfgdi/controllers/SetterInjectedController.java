package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingService;

public class SetterInjectedController {

    private GreedingService greedingService;

    public void setGreedingService(GreedingService greedingService) {
        this.greedingService = greedingService;
    }

    public String getGreeding() {
        return greedingService.sayGreeding();
    }
}
