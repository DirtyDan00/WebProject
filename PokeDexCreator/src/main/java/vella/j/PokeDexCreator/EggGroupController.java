package vella.j.PokeDexCreator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/EggGroups")
public class EggGroupController {

	@Autowired
	private EggGroupJpaRepository EggGroupJpaRepository;
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<EggGroupObj> listAllGroups() {
		return EggGroupJpaRepository.findAll();
	}
}
