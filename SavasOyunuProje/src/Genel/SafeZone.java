package Genel;

public class SafeZone{
	//Can yeniliyoruz
 
	
	//Karakterin canını BaseHeal değeri ile set ediyoruz
	public void healRegeneration(Karakter karakter) {
		karakter.setHeal(karakter.getBaseHeal());
		System.out.println("Güvenli bölgeye geldiniz canınız fullendi CAN: ."+karakter.getHeal());
	}

}
