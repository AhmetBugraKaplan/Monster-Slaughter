package Genel;

import java.util.Scanner;

public class Shop {

	Scanner scanner = new Scanner(System.in);
	int answer;
	
	public void OpentheShop(Karakter karakter) {
		System.out.println("Mağzaya Hoşgeldiniz...");
		System.out.println("Ürünleri görmek için 1'e çıkış yapmak için 2'ye tıklayınız");
		answer=scanner.nextInt();
		System.out.println(karakter.getMoney());
		if(answer==1) {
			System.out.println("1---> Adı: Tabanca   Hasarı: +2   Fiyatı: 25 Gold");
			System.out.println("2---> Adı: Kılıç     Hasarı: +3   Fiyatı: 35 Gold");
			System.out.println("3---> Adı: Tüfek     Hasarı: +7   Fiyatı: 50 Gold");
			answer=scanner.nextInt();
			
			switch(answer) {
			case 1:
				if(karakter.getMoney()>=25) {
				 karakter.setDamage(karakter.getDamage()+2);
				 karakter.setMoney(karakter.getMoney()-25);
				 System.out.println("Tabanca alındı kalan para "+karakter.getMoney()+" , karakterinin hasarı "+karakter.getDamage());
				}
				else
				System.out.println("YETERSİZ BAKİYE!!!");
				break;
			case 2:	
				if(karakter.getMoney()>=35) {
					 karakter.setDamage(karakter.getDamage()+3);
					 karakter.setMoney(karakter.getMoney()-35);
					 System.out.println("Kılıç alındı kalan para "+karakter.getMoney()+" , karakterinin hasarı "+karakter.getDamage());
				}
				else
				System.out.println("YETERSİZ BAKİYE!!!");
				break;
			case 3:
				if(karakter.getMoney()>=50) {
					 karakter.setDamage(karakter.getDamage()+7);
					 karakter.setMoney(karakter.getMoney()-50);
					 System.out.println("Pompalı Tüfek alındı kalan para "+karakter.getMoney()+" , karakterinin hasarı "+karakter.getDamage());
					}
				else
					System.out.println("YETERSİZ BAKİYE!!!");
				break;
			}
		}
		else if(answer == 2) {
			karakter.Menu();
		}
		else {
			System.out.println("Yanlış seçim yaptınız lütfen tekrar deneyiniz...");
		}
	}
	
}
