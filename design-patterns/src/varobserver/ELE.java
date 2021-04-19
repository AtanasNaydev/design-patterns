package varobserver;

import java.util.ArrayList;
import java.util.List;



public class ELE implements EVNElectricity {
	
	private List<Electricity>electricity;
	private String ele;

	public ELE() {
		this.electricity=new ArrayList<>();
	}

	@Override
	public void ElectricityOn(Electricity electricity) {
		this.electricity.add(electricity);
		electricity.setELE(this);

	}

	@Override
	public void ElectricityOff(Electricity electricity) {
		this.electricity.remove(electricity);


	}

	@Override
	public void notifyEVN() {
		for(Electricity electricity: this.electricity) {
			electricity.update();
			
		}

	}



	@Override
	public String getUpdate() {
		return this.ele;
	}
	public void setELE(String ele) {
		this.ele = ele;
		this.notifyEVN();
	}

}
