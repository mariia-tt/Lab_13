package ua.edu.ucu.taskone;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FacebookUser {

    private String email;
    private String userCountry;
    private String userActiveTime;

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserActiveTime() {
        return userActiveTime;
    }

    
}
