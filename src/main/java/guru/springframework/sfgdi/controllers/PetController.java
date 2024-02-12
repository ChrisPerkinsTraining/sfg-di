package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) { this.petService = petService; }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
