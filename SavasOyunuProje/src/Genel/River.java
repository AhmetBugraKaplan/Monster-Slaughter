package Genel;

public class River extends Forest{

	int NumberOfBear;
	
	public void RiverFight(Karakter karakter) {
		
		NumberOfBear = 1+random.nextInt(3);
		System.out.println("Dikkat et nehire girmek üzeresin karşına "+NumberOfBear+"tane ayı çıkacak");
		System.out.println("Nehire girmek istiyor musun ? -evet -hayır");
		answer = scanner.next();
		
		switch(answer) {
		
		case "evet":
			karakter.ShowFightInfos();
			Bear bear = new Bear();
			while(NumberOfBear > 0) {
			this.FightStart(bear,karakter);
			NumberOfBear--;
			karakter.setMoney(karakter.getMoney() + 5);
			bear.heal=bear.baseHeal;
			System.out.println("Kalan ayı sayısı "+NumberOfBear);
			}
			
			
			break;
		
		case "hayır":
			
			break;
			
			default:
				System.out.println("Yanlış cevap , lütfen cevabınızı kontrol edin");
		}
		
		
	}
	
}
