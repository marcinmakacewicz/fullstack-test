package com.instantor.dap.springbootbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/sw")
public class StarWarsCharacterController {
	
	@Autowired
	StarWarsCharacterService starWarsCharacterService;
	
    /**
     * @return character from Star Wars
     */
    @GetMapping("/character")
    public String getCharacter() {
    	return starWarsCharacterService.getRandomStarWarsCharacterName();
    }
}
