package vella.j.PokeDexCreator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Moves")
public class MovesController {

	@Autowired
	private MovesJpaRepository MovesJpaRepository;
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<MovesObj> GetMoves() {
		return MovesJpaRepository.findAll();
	
	}
}
	
