package vella.j.PokeDexCreator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Abilities")
public class AbilityController {
	
	@Autowired
	private AblilityJpaRepository AblilityJpaRepository;
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<AblilityObj> GetAbilities() {
		return AblilityJpaRepository.findAll();
		//find all
		//get method
		//returns the find all as objects
		
	}
}
