package Genel;

import java.util.Random;
import java.util.Scanner;

 public class main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	Karakter karakter = new Karakter();
	Cave cave = new Cave();
	Fight fight = new Fight();
	Zombie zombie = new Zombie();
	
//	//Test
//	System.out.println(karakter.getHeal()+karakter.getDamage()+karakter.getMoney());
//	System.out.println(karakter.getName());
	
	
	
	
	karakter.CharacterSelection();
	//cave.CaveFight(karakter);
	karakter.Menu();
	//karakter.ShowFightInfos();
	
	
	
	
//	fight.FightStart(zombie,karakter);
	
	
	
	
	
	}

}
