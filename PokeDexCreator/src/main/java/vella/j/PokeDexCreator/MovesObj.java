package vella.j.PokeDexCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moves")
public class MovesObj {

	@Id
	private int Id;
	@Column(name = "identifier", nullable = false)
	private String identifier;
	@Column(name = "power", nullable = false)
	private int power;
	@Column(name = "accuracy", nullable = false)
	private int accuracy;
	@Column(name = "pp", nullable = false)
	private int pp;


	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public MovesObj() {
		
	}
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public MovesObj(int id, String identifier, int power, int accuracy, int pp) {
		super();
		Id = id;
		this.identifier = identifier;
		this.power = power;
		this.accuracy = accuracy;
		this.pp = pp;
	}

	
}
