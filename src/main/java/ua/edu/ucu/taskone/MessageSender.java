package ua.edu.ucu.taskone;

public class MessageSender {
    public void send(User user, String text) {
        System.out.println("Sent message to: " + user);
        System.out.println("Message: " + text);
    }
}
