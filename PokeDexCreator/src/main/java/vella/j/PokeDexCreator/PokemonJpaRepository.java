package vella.j.PokeDexCreator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonJpaRepository extends JpaRepository<PokemonObj, Integer>{

}
