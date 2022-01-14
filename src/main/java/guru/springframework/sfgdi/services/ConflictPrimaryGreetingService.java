package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ConflictPrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Conflict Hello";
    }
}
