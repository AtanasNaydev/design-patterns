package MediatorandSingleton;



public class Singleton {
	
	
	private static Singleton bot;

	private Singleton() {
		// TODO Auto-generated method stub

	}
	
	
	public static Singleton getInstance() {
		
		if(bot==null) {
			bot= new Singleton();
		}
		return bot;
	}

	public void postMessage(String message) {
		System.out.println("The "+  message);
	}
}
