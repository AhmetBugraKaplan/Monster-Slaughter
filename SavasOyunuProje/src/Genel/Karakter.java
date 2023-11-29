package Genel;

import java.util.Scanner;

public class Karakter {
	
	private int id,damage,heal,money,baseHeal;
	private String name;
	private int CharacterID;
	Scanner scanner = new Scanner(System.in);	
	
	public Karakter() {
		
	}
	
	
	public void Menu() {
		int konum;
	
		do {
		System.out.println("Lütfen gitmek istediğiniz konumu seçiniz =>");
		System.out.println("1. Güvenli bölge --> Düşman yok , canınız tazeleniyor");
		System.out.println("2.     Mağara    --> 1 ile 3 arasında zombi çıkabilir , 1 zombi öldürmek 2 gold kazandırır");
		System.out.println("3.     Orman     --> 1 ile 3 arasında vampir çıkabilir , 1 vampir öldürmek 4 gold kazandırır");	
		System.out.println("4.     Nehir     --> 1 ile 3 arasında ayı çıkabilir , 1 ayı öldürmek 5 gold kazandırır");	
		System.out.println("5.     Mağza     --> Çeşitli eşyaların bulunduğu bir mağza");	
		
		System.out.println("6.     Çıkış");
		konum=scanner.nextInt();
			switch(konum) {
		
		case 1:
			SafeZone sz = new SafeZone();
			sz.healRegeneration(this);
			break;
		case 2:	
			Cave cave = new Cave();
			cave.CaveFight(this);
			break;
		case 3:
			Forest forest = new Forest();
			forest.ForestFight(this);
			break;
		case 4:
			River river = new River();
			river.RiverFight(this);
			break;
		case 5:
			Shop shop = new Shop();
			shop.OpentheShop(this);
			break;
		default:
			System.out.println("Yanlış tuşlama lütfen tekrar deneyiniz!!!");
			
			
			}
		}while(konum != 6);
		
		
	}
	
	public void CharacterSelection() {
		
		System.out.println("Hayatta Kalma Oyununa Hoşgeldiniz");
		do {
		System.out.println("1-Samuray 2-Okçu 3-Şovalye \nLütfen bir karakter seçiniz:");
		CharacterID = scanner.nextInt();
			switch(CharacterID) {
		case 1:
			setPlayerSkills("Samuray",1, 5, 21, 15,21);
			//this.heal=21;
			break;
		case 2:
			setPlayerSkills("Okçu", 2, 7, 18, 20,18);
			break;
		case 3:
			setPlayerSkills("Şovalye", 3, 8, 24, 5,24);
			break;
			
			default:
				System.out.println("Hatalı tuşlama yaptınız lütfen tekrar deneyiniz:");
		}
		} while (CharacterID>3 || CharacterID < 1);
		
		if(CharacterID<4 && CharacterID>0) {
		System.out.println("Karakteriniz seçilmiştir,karaktere ait bilgiler:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+id);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
		}	
	}
	public void setPlayerSkills(String name,int id,int damage ,int heal ,int money,int baseHeal) {
		setName(name);
		setId(id);
		setDamage(damage);
		setHeal(heal);
		setMoney(money);
		setBaseHeal(baseHeal);
	}
	
	public void ShowInfos() {
		System.out.println("Karakteriniz seçilmiştir,karaktere ait bilgiler:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+id);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
	}
	
	public void ShowFightInfos() {
		System.out.println("Karakterinizin Bilgileri:");
		System.out.println("İsim:  "+name);
		System.out.println("ID:    "+id);
		System.out.println("Hasar: "+damage);
		System.out.println("Can:   "+heal);
		System.out.println("Para:  "+money);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
