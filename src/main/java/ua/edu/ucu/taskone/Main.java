package ua.edu.ucu.taskone;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser(
                    "facebook_email", 
                    "Ukraine", 
                    LocalDateTime.now().toString());
                user = new FacebookuserAdapter(facebookUser);
                break;
            
            case TWITTER:
                Twitteruser twitteruser = new Twitteruser(
                    "twiiter_email",
                    "USA",
                    LocalDateTime.now().minusDays(1).toString());
                user = new TwittwerUserAdapter(twitteruser);
                break;
        
            default:
                break;
        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}