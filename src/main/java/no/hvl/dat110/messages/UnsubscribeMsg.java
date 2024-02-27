package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic
    private String topic;

    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
    @Override
    public String toString() {
        return "UnsubscribeMsg{" +
                "user='" + super.getUser() + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    // TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
}
