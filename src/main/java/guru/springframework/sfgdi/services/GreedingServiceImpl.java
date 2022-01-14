package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreedingServiceImpl implements GreedingService {
    @Override
    public String sayGreeding() {
        return "hello world";
    }
}
