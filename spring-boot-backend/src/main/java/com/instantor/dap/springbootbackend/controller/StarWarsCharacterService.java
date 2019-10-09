package com.instantor.dap.springbootbackend.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.instantor.dap.springbootbackend.model.StarWarsCharacter;

@Service
public class StarWarsCharacterService {
	
	private static ArrayList<StarWarsCharacter> starWarsCharacters = new ArrayList<>();
	private static Random randomCharacter = new Random();
	
	static {
		starWarsCharacters.add(new StarWarsCharacter("Luke"));
		starWarsCharacters.add(new StarWarsCharacter("Anakin"));
		starWarsCharacters.add(new StarWarsCharacter("Yoda"));
		starWarsCharacters.add(new StarWarsCharacter("Leya"));
	}
	
	public String getRandomStarWarsCharacterName() {
		return starWarsCharacters.get( randomCharacter.nextInt(starWarsCharacters.size()) ).getName();
	}
}
