package varobserver;



public class ElectricityMain {

	public static void main(String[] args) {
		ELE ele= new ELE();
		
		Electricity ele1= new EVNEle("ele 1");
		Electricity ele2= new EVNEle("ele 2");
		Electricity ele3= new EVNEle("ele 3");
		
		ele.ElectricityOn(ele1);
		ele.ElectricityOn(ele2);
		ele.ElectricityOn(ele3);
		
		
		ele.setELE("215 leva");
		
		ele.setELE("115 leva");
	

	}

}
