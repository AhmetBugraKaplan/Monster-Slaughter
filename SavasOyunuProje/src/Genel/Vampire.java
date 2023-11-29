package Genel;

public class Vampire extends Monsters{

	public Vampire() {
		this.setName("Vampir");
		this.setID(2);
		this.setDamage(4);
		this.setHeal(14);
		this.setMoney(7);
		this.setBaseHeal(14);
	}
	
	public void ShowInfos() {
		System.out.println("Vampire ait bilgiler:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+ID);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
	}
	
}
