package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreedingServiceImpl());

    }

    @Test
    void getGreeding() {
        System.out.println(constructorInjectedController.getGreeding());
    }
}