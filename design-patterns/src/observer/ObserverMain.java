package observer;

public class ObserverMain {

	public static void main(String[] args) {
	Topic topic= new Topic();
	
	Observer obs1= new TopicSubscriber("Obs 01");
	Observer obs2= new TopicSubscriber("Obs 02");
	Observer obs3= new TopicSubscriber("Obs 03");
	
	topic.subscribe(obs1);
	topic.subscribe(obs2);
	topic.subscribe(obs3);
	
	
	topic.setTopic("Breaking news: Bulgarian elections 2021");
	
	topic.setTopic("Breaking news:Covid-19 strikes again");
	
	}

}
