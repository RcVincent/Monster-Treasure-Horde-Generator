package model;

import java.util.Random;
public class RandomRoller {
	private Random r;
	 
	
	//magic item rewards 
	public int GearRewards(Random r) {
		return r.nextInt(100 + 1);	
	}
	
	//gem rewards
	public int LowGemRewards(Random r) {
		return 0; 
	}
	
	public int MedGemRewards(Random r) {
		return 0; 
	}
	
	public int HighGemRewards(Random r) {
		return 0; 
	}
	
	public int LegendaryGemRewards(Random r) {
		return 0; 
	}
	
	
	//gold rewards section
	public int LowGoldRewards(Random r) {
		return r.nextInt(1000) + 200;
		
	}
	
	public int MediumGoldRewards(Random r) {
		return r.nextInt(10000) + 2000;
		
	}
	
	public int HighGoldRewards(Random r) {
		return r.nextInt(100000) + 20000;
		
	}
	 
	public int LegendaryGoldRewards(Random r) {
		return r.nextInt(1000000) + 200000;
		
	}
	
	//getters and setters 
	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	} 
	
	 
}
