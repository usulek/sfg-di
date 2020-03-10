package pl.usulek.sfgdi.controllers;

import org.springframework.stereotype.Component;
import pl.usulek.sfgdi.services.GreetingService;

@Component
public class ConstructorInjectedController {

    // @Autowired nie jest wymagane w tym typie wstrzykiwania zależności
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
