package MediatorandSingleton;


public interface MessageMediator {
	void sendMessage(String message, User user);
	void registerUser(User user);
	void unregisterUser(User user);
}
