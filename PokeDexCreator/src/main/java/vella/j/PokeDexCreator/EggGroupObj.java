package vella.j.PokeDexCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EggGroup")
public class EggGroupObj {

	@Id
	@Column(name = "id", nullable = false)
	private int eggGroupId;
	
	@Column(name = "identifier", nullable = false)
	private int names;

	public int getEggGroupId() {
		return eggGroupId;
	}

	public void setEggGroupId(int eggGroupId) {
		this.eggGroupId = eggGroupId;
	}

	public int getNames() {
		return names;
	}

	public void setNames(int names) {
		this.names = names;
	}

	public EggGroupObj(int eggGroupId, int names) {
		super();
		this.eggGroupId = eggGroupId;
		this.names = names;
	}

	public EggGroupObj() {
		
	}
	
	
	
	
}
