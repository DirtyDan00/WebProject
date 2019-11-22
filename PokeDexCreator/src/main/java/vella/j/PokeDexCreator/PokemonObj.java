package vella.j.PokeDexCreator;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pokemon")
public class PokemonObj {

	@Id
	private int pokemonId;
	@Column(name = "Type", nullable = false)
	private String type;
	@Column(name = "Type2", nullable = true)
	private String type2;
	@Column(name = "Name", nullable = false)
	private String Name;
	
	@ManyToMany
	private Collection<TypeObj> weaknesses;
	@ManyToMany
	private Collection<TypeObj> immunities;
	@ManyToMany
	private Collection<TypeObj> resitances;
	@OneToMany
	private List<StatsObj> stats;
	@OneToMany
	private Collection<AblilityObj> ablities;
	@OneToMany
	private Collection<FormsObj> forms;
	@OneToMany
	private Collection<MovesObj> learnedMoves;
	@OneToMany
	private Collection<EggGroupObj> eggGroup;

	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Collection<TypeObj> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(Collection<TypeObj> weaknesses) {
		this.weaknesses = weaknesses;
	}

	public Collection<TypeObj> getImmunities() {
		return immunities;
	}

	public void setImmunities(Collection<TypeObj> immunities) {
		this.immunities = immunities;
	}

	public Collection<TypeObj> getResitances() {
		return resitances;
	}

	public void setResitances(Collection<TypeObj> resitances) {
		this.resitances = resitances;
	}

	public List<StatsObj> getStats() {
		return stats;
	}

	public void setStats(List<StatsObj> stats) {
		this.stats = stats;
	}

	public Collection<AblilityObj> getAblities() {
		return ablities;
	}

	public void setAblities(Collection<AblilityObj> ablities) {
		this.ablities = ablities;
	}

	public Collection<FormsObj> getForms() {
		return forms;
	}

	public void setForms(Collection<FormsObj> forms) {
		this.forms = forms;
	}

	public Collection<MovesObj> getLearnedMoves() {
		return learnedMoves;
	}

	public void setLearnedMoves(Collection<MovesObj> learnedMoves) {
		this.learnedMoves = learnedMoves;
	}

	public Collection<EggGroupObj> getEggGroup() {
		return eggGroup;
	}

	public void setEggGroup(Collection<EggGroupObj> eggGroup) {
		this.eggGroup = eggGroup;
	}

	public PokemonObj() {
		
	}
	public PokemonObj(int pokemonId, String type, String type2, String name, Collection<TypeObj> weaknesses,
			Collection<TypeObj> immunities, Collection<TypeObj> resitances, List<StatsObj> stats,
			Collection<AblilityObj> ablities, Collection<FormsObj> forms, Collection<MovesObj> learnedMoves,
			Collection<EggGroupObj> eggGroup) {
		super();
		this.pokemonId = pokemonId;
		this.type = type;
		this.type2 = type2;
		Name = name;
		this.weaknesses = weaknesses;
		this.immunities = immunities;
		this.resitances = resitances;
		this.stats = stats;
		this.ablities = ablities;
		this.forms = forms;
		this.learnedMoves = learnedMoves;
		this.eggGroup = eggGroup;
	}
	
}
