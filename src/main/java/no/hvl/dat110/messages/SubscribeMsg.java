package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

    // message sent from client to subscribe on a topic
	private String user;
    private String topic;

    public SubscribeMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

		
}
