package main;


import java.util.Random;
import java.util.Scanner;

import model.RandomRoller;
public class Main {

	static RandomRoller r = new RandomRoller(); 
	static Random rand = new Random(); 
	
	public static void main(String[] args) throws Exception {
		int gold = 0, gems = 0, gearHaul = 0, geartable = 0; 
		
		int items[] = new int[0]; 
		
		Scanner k = new Scanner(System.in);
		
		System.out.printf("What would you rate the challenge on a scale on 1 to 10?");
		int challenge = k.nextInt();
		
		if(challenge <= 0 || challenge > 10) {
			System.out.printf("Invalid parameters: please use a number between 1 and 10");
			challenge = k.nextInt();
		}
		
		//low teir challenge
		if(challenge <= 3) {
			gold = r.LowGoldRewards(rand);
			gearHaul = rand.nextInt(4) + 1;
			geartable = rand.nextInt(3) + 1;
			
			items = new int[gearHaul + 1]; 
			for(int i = 0; i < gearHaul; i++) {
				items[i] = r.GearRewards(rand); 
			}
			 
		}
		
		//medium teir challenge
		else if(challenge > 3 && challenge < 7) {
			gold = r.MediumGoldRewards(rand);
			gearHaul = rand.nextInt(6) + 1;
			geartable = rand.nextInt(3) + 3;
			items = new int[gearHaul + 1]; 
			for(int i = 0; i < gearHaul; i++) {
				items[i] = r.GearRewards(rand); 
			}
		}
		
		//high teir challenge
		else if(challenge > 6 && challenge < 10) {
			gold = r.HighGoldRewards(rand);
			gearHaul = rand.nextInt(10) + 1;
			geartable = rand.nextInt(3) + 6;
			items = new int[gearHaul + 1]; 
			for(int i = 0; i < gearHaul; i++) {
				items[i] = r.GearRewards(rand); 
			}
		}
		
		//legendary teir challenge 
		else if(challenge == 10) {
			gold = r.LegendaryGoldRewards(rand); 
			gearHaul = rand.nextInt(7) + 3;
			geartable = 9;
			items = new int[gearHaul + 1]; 
			for(int i = 0; i < gearHaul; i++) {
				items[i] = r.GearRewards(rand); 
			}
		}
		
		System.out.println("The party earned " + gold + " pieces of gold");
		System.out.println("The party earned " + gearHaul + " items from table " + geartable);
		for(int i = 0; i < gearHaul; i++) {
			System.out.printf(items[i] + ", "); 
		}
	}

}
