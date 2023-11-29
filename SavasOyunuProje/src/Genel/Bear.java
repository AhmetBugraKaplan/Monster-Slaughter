package Genel;

public class Bear extends Monsters{

	public Bear() {
		this.setName("Ayı");
		this.setID(3);
		this.setDamage(7);
		this.setHeal(20);
		this.setMoney(12);
		this.setBaseHeal(20);
	}
	
	public void ShowInfos() {
		System.out.println("Ayıya ait bilgiler:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+ID);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
	}
	
}
