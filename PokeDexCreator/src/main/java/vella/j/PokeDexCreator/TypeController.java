package vella.j.PokeDexCreator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/Types")
public class TypeController {

	@Autowired
	private TypeJpaRepository TypeJpaRepository;
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<TypeObj> GetTypes() {
		return TypeJpaRepository.findAll();
	}
}
