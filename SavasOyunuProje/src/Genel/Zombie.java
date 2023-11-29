package Genel;

public class Zombie extends Monsters{

	 
	public Zombie() {
		this.setName("Zombi");
		this.setID(1);
		this.setDamage(3);
		this.setHeal(10);
		this.setMoney(4);
		this.setBaseHeal(10);
	}
	
	public void ShowInfos() {
		System.out.println("Zombiye ait bilgiler:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+ID);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
	}
		
}
