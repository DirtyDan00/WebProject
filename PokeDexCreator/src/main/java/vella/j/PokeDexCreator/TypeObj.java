package vella.j.PokeDexCreator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Types")
public class TypeObj {

	@Id
	private String Type1;
	//nullable true
	private String Type2;
	//not sure how to annotate these
	private String grass;
	
	private String water;
	
	private String fire;
	
	private String electric;
	
	private String flying;
	
	private String bug;
	
	private String rock;
	
	private String ground;
	
	private String ice;
	
	private String dragon;
	
	private String steel;
	
	private String ghost;
	
	private String dark;
	
	private String fighting;
	
	private String posion;
	
	private String fairy;
	
	public String getType1() {
		return Type1;
	}
	
	public void setType1(String type1) {
		Type1 = type1;
	}
	
	public String getType2() {
		return Type2;
	}
	
	public void setType2(String type2) {
		Type2 = type2;
	}

	public String getGrass() {
		return grass;
	}

	public void setGrass(String grass) {
		this.grass = grass;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}

	public String getElectric() {
		return electric;
	}

	public void setElectric(String electric) {
		this.electric = electric;
	}

	public String getFlying() {
		return flying;
	}

	public void setFlying(String flying) {
		this.flying = flying;
	}

	public String getBug() {
		return bug;
	}

	public void setBug(String bug) {
		this.bug = bug;
	}

	public String getRock() {
		return rock;
	}

	public void setRock(String rock) {
		this.rock = rock;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getDragon() {
		return dragon;
	}

	public void setDragon(String dragon) {
		this.dragon = dragon;
	}

	public String getSteel() {
		return steel;
	}

	public void setSteel(String steel) {
		this.steel = steel;
	}

	public String getGhost() {
		return ghost;
	}

	public void setGhost(String ghost) {
		this.ghost = ghost;
	}

	public String getDark() {
		return dark;
	}

	public void setDark(String dark) {
		this.dark = dark;
	}

	public String getFighting() {
		return fighting;
	}

	public void setFighting(String fighting) {
		this.fighting = fighting;
	}

	public String getPosion() {
		return posion;
	}

	public void setPosion(String posion) {
		this.posion = posion;
	}

	public String getFairy() {
		return fairy;
	}

	public void setFairy(String fairy) {
		this.fairy = fairy;
	}

	public TypeObj(String type1, String type2, String grass, String water, String fire, String electric, String flying,
			String bug, String rock, String ground, String ice, String dragon, String steel, String ghost, String dark,
			String fighting, String posion, String fairy) {
		super();
		Type1 = type1;
		Type2 = type2;
		this.grass = grass;
		this.water = water;
		this.fire = fire;
		this.electric = electric;
		this.flying = flying;
		this.bug = bug;
		this.rock = rock;
		this.ground = ground;
		this.ice = ice;
		this.dragon = dragon;
		this.steel = steel;
		this.ghost = ghost;
		this.dark = dark;
		this.fighting = fighting;
		this.posion = posion;
		this.fairy = fairy;
	}

	public TypeObj() {
		
	}
	
	
}
