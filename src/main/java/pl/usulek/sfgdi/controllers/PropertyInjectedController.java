package pl.usulek.sfgdi.controllers;

import pl.usulek.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
