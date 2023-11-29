package Genel;

import java.util.Random;
import java.util.Scanner;

public class Forest extends Cave {
	
	int NumberOfVampires;
	
	public void ForestFight(Karakter karakter) {
		NumberOfVampires = 1+random.nextInt(3);
		System.out.println("Dikkat et ormana girmek üzeresin karşına "+NumberOfVampires+"tane vampir çıkacak");
		System.out.println("Ormana girmek istiyor musun ? -evet -hayır");
		answer = scanner.next();
		
		switch(answer) {
		
		case "evet":
			karakter.ShowFightInfos();
			Vampire vampire = new Vampire();
			while(NumberOfVampires > 0) {
			this.FightStart(vampire,karakter);
			NumberOfVampires--;
			karakter.setMoney(karakter.getMoney() + 4);
			vampire.heal=vampire.baseHeal;
			System.out.println("Kalan zombi sayısı "+NumberOfVampires);
			}
			
			
			break;
		
		case "hayır":
			
			break;
			
			default:
				System.out.println("Yanlış cevap , lütfen cevabınızı kontrol edin");
		}
		
	}
	
	
}
