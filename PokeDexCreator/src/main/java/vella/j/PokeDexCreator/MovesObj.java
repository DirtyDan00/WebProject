package vella.j.PokeDexCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moves")
public class MovesObj {

	@Id
	private int moveId;
	@Column(name = "physical", nullable = false)//not sure if this is what we want to annoate
	private String physical;
	@Column(name = "special", nullable = false)
	private String special;
	@Column(name = "status", nullable = false)
	private String status;

	public int getMoveId() {
		return moveId;
	}

	public void setMoveId(int moveId) {
		this.moveId = moveId;
	}

	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MovesObj(int moveId, String physical, String special, String status) {
		super();
		this.moveId = moveId;
		this.physical = physical;
		this.special = special;
		this.status = status;
	}

	public MovesObj() {
		
	}
	
	
}
