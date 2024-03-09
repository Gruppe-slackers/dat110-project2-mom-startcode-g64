package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to delete a topic on the broker
    private String topic;

    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC,user);
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }


    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "user='" + super.getUser() + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

}
