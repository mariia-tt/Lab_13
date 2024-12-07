package ua.edu.ucu.tasktwo;

public class DataBase extends БазаДаних {
    public String obtainUserData() {
        return отриматиДаніКористувача();
    }

    public String obtainStatisticalData() {
        return отриматиСтатистичніДані();
    }
}
