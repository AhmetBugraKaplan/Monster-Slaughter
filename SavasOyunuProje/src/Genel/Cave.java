package Genel;

import java.util.Random;
import java.util.Scanner;

public class Cave extends Fight{

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int NumberOfZombies;
	String answer;
	
	public void CaveFight(Karakter karakter) {
		
		NumberOfZombies = 1+random.nextInt(3);
		System.out.println("Dikkat et mağraya girmek üzeresin karşına "+NumberOfZombies+"tane zombi çıkacak");
		System.out.println("Mağraya girmek istiyor musun ? -evet -hayır");
		answer = scanner.next();
		
		switch(answer) {
		
		case "evet":
			karakter.ShowFightInfos();
			//zombie nesnesini yukarıda tanımlama ile aşşağıda tanımlama arasındaki fark ne ?
			Zombie zombie = new Zombie();
			while(NumberOfZombies > 0) {
			this.FightStart(zombie,karakter);
			NumberOfZombies--;
			karakter.setMoney(karakter.getMoney() + 2);
			zombie.heal=zombie.baseHeal;
			System.out.println("Kalan zombi sayısı "+NumberOfZombies);
			}
			
			
			break;
		
		case "hayır":
			
			break;
			
			default:
				System.out.println("Yanlış cevap , lütfen cevabınızı kontrol edin");
		}
		
	}
	
}
