package MediatorandSingleton;


public class MediatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageMediator chat= new Chat();
		
		User user1=new ChatUser(chat, "Ivan");
		User user2=new ChatUser(chat, "Petko");
		User user3=new ChatUser(chat, "Stefan");
		
		user1.send("Hello guys, how are you?");
		user2.send("I am fine, thank you, how about you?");
		user2.send("addBot");
		user3.send("cat");
		user1.send("Uhhh, poor Stefan is now banned...");
	
	}

}
