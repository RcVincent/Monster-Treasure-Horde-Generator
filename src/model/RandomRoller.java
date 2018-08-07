package model;

import java.util.Random;
public class RandomRoller {
	private Random r;
	 
	
	//magic item rewards 
	public int GearRewards(Random r) {
		return r.nextInt(100 + 1);	
	}
	
	//gem rewards
	
	
	//gold rewards section
	public int LowGoldRewards(Random r) {
		return r.nextInt(1000) + 100;
		
	}
	
	public int MediumGoldRewards(Random r) {
		return r.nextInt(10000) + 1000;
		
	}
	
	public int HighGoldRewards(Random r) {
		return r.nextInt(100000) + 10000;
		
	}
	 
	public int LegendaryGoldRewards(Random r) {
		return r.nextInt(1000000) + 100000;
		
	}
	
	//getters and setters 
	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	} 
	
	 
}
