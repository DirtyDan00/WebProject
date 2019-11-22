package vella.j.PokeDexCreator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EggGroup")
public class EggGroupObj {

	@Id
	private int eggGroupId;
	@ManyToMany
	private String monster;
	@ManyToMany
	private String water1;
	@ManyToMany
	private String water2;
	@ManyToMany
	private String water3;
	@ManyToMany
	private String bug;
	@ManyToMany
	private String fairy;
	@ManyToMany
	private String field;
	@ManyToMany
	private String grass;
	@ManyToMany
	private String humanLike;
	@ManyToMany
	private String flying;
	@ManyToMany
	private String mineral;
	@OneToOne
	private String ditto;//ditto has its own breeding groups
	@ManyToMany
	private String dragon;
	@ManyToMany
	private String unknown;
	@ManyToMany
	private String amorphous;

	public int getEggGroupId() {
		return eggGroupId;
	}

	public void setEggGroupId(int eggGroupId) {
		this.eggGroupId = eggGroupId;
	}

	public String getMonster() {
		return monster;
	}

	public void setMonster(String monster) {
		this.monster = monster;
	}

	public String getWater1() {
		return water1;
	}

	public void setWater1(String water1) {
		this.water1 = water1;
	}

	public String getWater2() {
		return water2;
	}

	public void setWater2(String water2) {
		this.water2 = water2;
	}

	public String getWater3() {
		return water3;
	}

	public void setWater3(String water3) {
		this.water3 = water3;
	}

	public String getBug() {
		return bug;
	}

	public void setBug(String bug) {
		this.bug = bug;
	}

	public String getFairy() {
		return fairy;
	}

	public void setFairy(String fairy) {
		this.fairy = fairy;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getGrass() {
		return grass;
	}

	public void setGrass(String grass) {
		this.grass = grass;
	}

	public String getHumanLike() {
		return humanLike;
	}

	public void setHumanLike(String humanLike) {
		this.humanLike = humanLike;
	}

	public String getFlying() {
		return flying;
	}

	public void setFlying(String flying) {
		this.flying = flying;
	}

	public String getMineral() {
		return mineral;
	}

	public void setMineral(String mineral) {
		this.mineral = mineral;
	}

	public String getDitto() {
		return ditto;
	}

	public void setDitto(String ditto) {
		this.ditto = ditto;
	}

	public String getDragon() {
		return dragon;
	}

	public void setDragon(String dragon) {
		this.dragon = dragon;
	}

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	public String getAmorphous() {
		return amorphous;
	}

	public void setAmorphous(String amorphous) {
		this.amorphous = amorphous;
	}

	public EggGroupObj() {
		
	}

	public EggGroupObj(int eggGroupId, String monster, String water1, String water2, String water3, String bug,
			String fairy, String field, String grass, String humanLike, String flying, String mineral, String ditto,
			String dragon, String unknown, String amorphous) {
		super();
		this.eggGroupId = eggGroupId;
		this.monster = monster;
		this.water1 = water1;
		this.water2 = water2;
		this.water3 = water3;
		this.bug = bug;
		this.fairy = fairy;
		this.field = field;
		this.grass = grass;
		this.humanLike = humanLike;
		this.flying = flying;
		this.mineral = mineral;
		this.ditto = ditto;
		this.dragon = dragon;
		this.unknown = unknown;
		this.amorphous = amorphous;
	}
	
	
	
}
