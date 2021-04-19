package varobserver;



public interface EVNElectricity {
	void ElectricityOn (Electricity electricity);
	void ElectricityOff (Electricity electricity);
	
	
	
	void notifyEVN();
	String getUpdate();

}
