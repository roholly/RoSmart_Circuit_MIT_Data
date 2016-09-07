/**
 * 
 */
package edu.acc.java;

import java.io.Serializable;


public class House implements Serializable {
	private String id;
	private int ac;
	private int	bath_outlet; 
	private int dishwasher; 
	private int disposal;
	private int electronics; 
	private int furnace; 
	private int heat; 
	private int kitchen_outlet;
	private int lighting; 
	private int main;
	private int microwave; 
	private int misc; 
	private int outdoor_outlet; 
	private int oven;  
	private int refrigerator; 
	private int smoke_alarm; 
	private int stove; 
	private int subpanel; 
	private int unknown_outlet; 
	private int washer_dryer; 
	
	/**
	 * 
	 */
	public House() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		if (ac > 0) {
			this.ac = ac;
		}
	}

	public int getBath_outlet() {
		return bath_outlet;
	}

	public void setBath_outlet(int bath_outlet) {
		if (bath_outlet > 0)  {
			this.bath_outlet = bath_outlet;
		}
	}

	public int getDishwasher() {
		return dishwasher;
	}

	public void setDishwasher(int dishwasher) {
		if (dishwasher > 0)  {
			this.dishwasher = dishwasher;
		}
	}

	public int getDisposal() {
		return disposal;
	}

	public void setDisposal(int disposal) {
		if (disposal > 0)  {
			this.disposal = disposal;
		}
	}

	public int getElectronics() {
		return electronics;
	}

	public void setElectronics(int electronics) {
		if (electronics > 0)  {
			this.electronics = electronics;
		}
	}

	public int getFurnace() {
		return furnace;
	}

	public void setFurnace(int furnace) {
		if (furnace > 0)  {
			this.furnace = furnace;
		}
	}

	public int getHeat() {
		return heat;
	}

	public void setHeat(int heat) {
		if (heat > 0)  {
			this.heat = heat;
		}
	}

	public int getKitchen_outlet() {
		return kitchen_outlet;
	}

	public void setKitchen_outlet(int kitchen_outlet) {
		if (kitchen_outlet > 0)  {
			this.kitchen_outlet = kitchen_outlet;
		}
	}

	public int getLighting() {
		return lighting;
	}

	public void setLighting(int lighting) {
		if (lighting > 0)  {
			this.lighting = lighting;
		}
	}
	
	public int getMain() {
		return main;
	}

	public void setMain(int main) {
		if (main > 0)  {
			this.main = main;
		}
	}

	public int getMicrowave() {
		return microwave;
	}

	public void setMicrowave(int microwave) {
		if (microwave > 0)  {
			this.microwave = microwave;
		}
	}

	public int getMisc() {
		return misc;
	}

	public void setMisc(int misc) {
		if (misc > 0)  {
			this.misc = misc;
		}
	}

	public int getOutdoor_outlet() {
		return outdoor_outlet;
	}

	public void setOutdoor_outlet(int outdoor_outlet) {
		if (outdoor_outlet > 0)  {
			this.outdoor_outlet = outdoor_outlet;
		}
	}

	public int getOven() {
		return oven;
	}

	public void setOven(int oven) {
		if (oven > 0)  {
			this.oven = oven;
		}
	}

	public int getRefrigerator() {
		return refrigerator;
	}

	public void setRefrigerator(int refrigerator) {
		if (refrigerator > 0)  {
			this.refrigerator = refrigerator;
		}
	}

	public int getSmoke_alarm() {
		return smoke_alarm;
	}

	public void setSmoke_alarm(int smoke_alarm) {
		if (smoke_alarm > 0)  {
			this.smoke_alarm = smoke_alarm;
		}
	}

	public int getStove() {
		return stove;
	}

	public void setStove(int stove) {
		if (stove > 0)  {
			this.stove = stove;
		}
	}

	public int getSubpanel() {
		return subpanel;
	}

	public void setSubpanel(int subpanel) {
		if (subpanel > 0)  {
			this.subpanel = subpanel;
		}
	}

	public int getUnknown_outlet() {
		return unknown_outlet;
	}

	public void setUnknown_outlet(int unknown_outlet) {
		if (unknown_outlet > 0)  {
			this.unknown_outlet = unknown_outlet;
		}
	}

	public int getWasher_dryer() {
		return washer_dryer;
	}

	public void setWasher_dryer(int washer_dryer) {
		if (washer_dryer > 0)  {
			this.washer_dryer = washer_dryer;
		}
	}
	
}
