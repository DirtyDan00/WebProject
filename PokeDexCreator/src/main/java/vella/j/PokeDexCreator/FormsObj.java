package vella.j.PokeDexCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Forms")
public class FormsObj {

	@Id
	private int formId;
	//may need to change for mew2 and charizard
	@Column(nullable = true)
	private String mega;
	
	@Column(nullable = true)
	private String alolan;
	
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	public String getMega() {
		return mega;
	}
	public void setMega(String mega) {
		this.mega = mega;
	}
	public String getAlolan() {
		return alolan;
	}
	public void setAlolan(String alolan) {
		this.alolan = alolan;
	}
	public FormsObj(int formId, String mega, String alolan) {
		super();
		this.formId = formId;
		this.mega = mega;
		this.alolan = alolan;
	}
	public FormsObj() {
		
	}
	
	 
	
}
