package Genel;

import java.util.Scanner;

public class Fight extends Karakter{

	Karakter karakter = new Karakter();
	Monsters monsters = new Monsters();
	
	Scanner scanner = new Scanner(System.in);
	String cevap;
	
	//Bu kısmı sor
	public void FightStart(Monsters monsters,Karakter karakter) {
		
		boolean death=false;
		boolean death2=false;
		boolean escape=false;
		do {
		
		System.out.println("Vur(V) Kaç(K)");
		cevap=scanner.next();
		switch(cevap) {
			
		case "V":
		System.out.println("Düşmana vurdun!!!");
		monsters.setHeal(monsters.getHeal() - karakter.getDamage());
		System.out.println("Karakterinin Canı: "+ karakter.getHeal());
		if(monsters.getHeal()<=0) {
				System.out.println(monsters.getName()+" Öldü");
				death=true;
				break;
			}
		else 
			System.out.println("Düşmanın Canı:"+monsters.getHeal());
		
		System.out.println("\nDüşman sana vurdu!!!");
		karakter.setHeal(karakter.getHeal() - monsters.getDamage());
		if(karakter.getHeal() < 1 )
		{
			System.out.println(monsters.getName()+" tarafından öldürüldün.Oyunun başına yönlendiriliyorsun");
			karakter.CharacterSelection();
			death2=true;
		}
		System.out.println("Karakterinin Canı: "+karakter.getHeal());
		System.out.println("Düşmanın Canı:"+monsters.getHeal());
			
			break; 
			
		case "K":
			System.out.println("Bölgeden kaçılıyor...\nAnlık can değeriniz:"+karakter.getHeal());
			karakter.Menu();
			escape=true;
			break;
			
		default:
			System.out.println("Hatalı tuşlama yaptınız lütfen tekrar deneyiniz!!!");
			}
		} while (cevap != "V" && death!=true && escape!=true && death2 != true);
		
		
	}
	
}
