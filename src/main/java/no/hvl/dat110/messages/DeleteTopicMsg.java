package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to delete a topic on the broker
    private String user;
    private String topic;

    public DeleteTopicMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getUser() {
        return this.user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

}
