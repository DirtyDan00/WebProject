package vella.j.PokeDexCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ablitiy")
public class AblilityObj {

	@Id
	private int ablilityId;
	@Column(name = "ability", nullable = false)
	private String ablility;
	@Column(name = "ability2", nullable = true)
	private String ablility2;
	@Column(name = "Hiddenability", nullable = true)
	private String Hability;

	public int getAblilityId() {
		return ablilityId;
	}

	public void setAblilityId(int ablilityId) {
		this.ablilityId = ablilityId;
	}

	public AblilityObj(int ablilityId, String ablility, String ablility2, String hability) {
		super();
		this.ablilityId = ablilityId;
		this.ablility = ablility;
		this.ablility2 = ablility2;
		Hability = hability;
	}
	

	public AblilityObj() {
		
	}

	public String getAblility() {
		return ablility;
	}

	public void setAblility(String ablility) {
		this.ablility = ablility;
	}

	public String getAblility2() {
		return ablility2;
	}

	public void setAblility2(String ablility2) {
		this.ablility2 = ablility2;
	}

	public String getHability() {
		return Hability;
	}

	public void setHability(String hability) {
		Hability = hability;
	}
}
