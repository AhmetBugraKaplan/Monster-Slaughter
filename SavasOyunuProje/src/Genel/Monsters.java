package Genel;

public class Monsters {
	protected int ID,damage,money,baseHeal,heal;
	String name;
	
	
	public Monsters() {
		
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseHeal() {
		return baseHeal;
	}

	public void setBaseHeal(int baseHeal) {
		this.baseHeal = baseHeal;
	}
	
	
}
