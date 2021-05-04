package MediatorandSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {
	
	
	private List<User> users;

	public Chat() {

		this.users=new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		
		User unregisterUser =null;
		
		Singleton b=Singleton.getInstance();
		if(message.equalsIgnoreCase("addBot")) {
			b.postMessage("Bot is added.");
		}
	
		for(User chatUser: this.users) {
			//Skip the one who sends the message
			if(chatUser !=user) {
				chatUser.receive(message);
			}
			if(b!=null &&message.contains("cat")) {
				System.out.println(chatUser.name+"" +"'cat' is forbidden word in our system, keep in mind before typing it out, otherwise u are going to be punished!");
				unregisterUser=user;
			}
			
		}
		if(unregisterUser!=null)
		{
			unregisterUser(unregisterUser);
			System.out.println("The user has been removed, due to using the forbidden word 'cat', what did u thought, huh? We are dog group!");
		}
		

	}



	@Override
	public void registerUser(User user) {
		this.users.add(user);
		
	}

	@Override
	public void unregisterUser(User user) {
	this.users.remove(user);
		
	}

}
