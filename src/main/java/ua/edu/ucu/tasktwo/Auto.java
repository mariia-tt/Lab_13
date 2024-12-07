package ua.edu.ucu.tasktwo;

public class Auto extends Авторизація {
    public boolean auto(DataBase db) {
        db.obtainUserData();
        return true;
    }
}
