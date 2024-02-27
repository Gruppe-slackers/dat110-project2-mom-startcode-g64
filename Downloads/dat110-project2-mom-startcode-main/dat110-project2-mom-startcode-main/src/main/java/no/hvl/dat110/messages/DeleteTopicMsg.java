package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	private String user;
	private String topic;

	// message sent from client to create topic on the broker

    public DeleteTopicMsg(String user, String topic) {
    	this.user = user;
    	this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

    public String getUser() {
    	return this.user;
    }
    public void setUser(String user) {
    	this.user = user;
    }
    public String getTopic() {
    	return this.topic;
    }
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    @Override
    public String toString() {
    	return this.topic + " has been deleted for user: " + this.user;
    }
}
