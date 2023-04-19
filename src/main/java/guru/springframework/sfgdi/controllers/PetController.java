package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 * Added the @Controller annotation to make spring aware of the PetController bean. cp on 19-04-23
 */
@Controller
public class PetController {

    private final PetService petService;

    /**
     * Added the constructor to inject the petService dependency into the PetController
     * @param petService
     */
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
