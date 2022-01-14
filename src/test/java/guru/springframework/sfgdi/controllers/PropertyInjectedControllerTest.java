package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
 PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greedingService = new GreedingServiceImpl();

    }

    @Test
    void getGreeding() {

        System.out.println(propertyInjectedController.getGreeding());
    }
}