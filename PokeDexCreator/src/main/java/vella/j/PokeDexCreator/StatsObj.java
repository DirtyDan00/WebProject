package vella.j.PokeDexCreator;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats")
public class StatsObj {

	@Id
	private List<StatsObj> TotalBaseStats;
	@Column(name = "Hp", nullable = false)
	private int Hp;
	@Column(name = "Attack", nullable = false)
	private int Attack;
	@Column(name = "Defense", nullable = false)
	private int Defense;
	@Column(name = "SpAttack", nullable = false)
	private int SpAttack;
	@Column(name = "SpDefense", nullable = false)
	private int SpDefense;
	@Column(name = "Speed", nullable = false)
	private int Speed;

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public int getAttack() {
		return Attack;
	}

	public void setAttack(int attack) {
		Attack = attack;
	}

	public int getDefense() {
		return Defense;
	}

	public void setDefense(int defense) {
		Defense = defense;
	}

	public int getSpAttack() {
		return SpAttack;
	}

	public void setSpAttack(int spAttack) {
		SpAttack = spAttack;
	}

	public int getSpDefense() {
		return SpDefense;
	}

	public void setSpDefense(int spDefense) {
		SpDefense = spDefense;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public StatsObj(int hp, int attack, int defense, int spAttack, int spDefense, int speed) {
		super();
		Hp = hp;
		Attack = attack;
		Defense = defense;
		SpAttack = spAttack;
		SpDefense = spDefense;
		Speed = speed;
	}

	public StatsObj() {
		
	}
}
