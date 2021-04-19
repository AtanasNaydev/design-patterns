package varobserver;



public class EVNEle implements Electricity {


	private String name;
	private EVNElectricity ele;
	public EVNEle(String name) {
		this.name=name;
	}

	@Override
	public void update() {
		if(this.ele==null) {
			System.out.println(this.getName()+" has no electricity: ");
			return;
		}
		
		String latestInformation=this.ele.getUpdate();
		System.out.println(this.getName()+" received electricity: "+latestInformation);

	}

	@Override
	public void setELE(EVNElectricity ele) {
		this.ele=ele;

	}

	

	public String getName() {
		return name;
	}

}
