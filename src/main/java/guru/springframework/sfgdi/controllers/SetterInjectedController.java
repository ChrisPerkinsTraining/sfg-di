package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public GreetingsService greetingsService;

    @Autowired
    public void setGreetingService( GreetingsService greetingsService ) {

        this.greetingsService = greetingsService;
    }

    public String getGreeting( ) {
        return greetingsService.sayGreeting();
    }
}
