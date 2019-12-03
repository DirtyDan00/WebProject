package vella.j.PokeDexCreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private PokemonJpaRepository PokemonJpaRepository;
	
	
	public void LoadPokemonInfo() {
		PokemonObj pokemon = new PokemonObj();
		//load the database information here
		//create a new object to be put into a pokedex? could be moved into pokedex obj
	}
}
