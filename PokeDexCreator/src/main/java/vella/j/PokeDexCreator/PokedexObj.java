package vella.j.PokeDexCreator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pokedex")
public class PokedexObj {

	@Id
	private int pokedexId;
	@OneToOne//maybe one to one?
	private PokemonObj pokemonData;
	public int getPokedexId() {
		return pokedexId;
	}
	public void setPokedexId(int pokedexId) {
		this.pokedexId = pokedexId;
	}
	public PokemonObj getPokemonData() {
		return pokemonData;
	}
	public void setPokemonData(PokemonObj pokemonData) {
		this.pokemonData = pokemonData;
	}
	public PokedexObj(int pokedexId, PokemonObj pokemonData) {
		super();
		this.pokedexId = pokedexId;
		this.pokemonData = pokemonData;
	}
	public PokedexObj() {
		
	}
	
	
	
}
