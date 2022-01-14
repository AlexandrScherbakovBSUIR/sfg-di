package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreedingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
 SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreedingService(new GreedingServiceImpl());


    }

    @Test
    void getGreeding() {
        System.out.println(setterInjectedController.getGreeding());
    }
}