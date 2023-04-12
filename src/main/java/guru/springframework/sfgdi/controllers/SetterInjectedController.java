package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class SetterInjectedController {

    public GreetingsService greetingsService;

    public void setGreetingService( GreetingsService greetingsService ) {

        this.greetingsService = greetingsService;
    }

    public String getGreeting( ) {
        return greetingsService.sayGreeting();
    }
}
