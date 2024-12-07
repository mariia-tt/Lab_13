package ua.edu.ucu.tasktwo;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        Auto auto = new Auto();
        if (auto.auto(db)) {
            ReportBuilder rb = new ReportBuilder(db);
        }
        //System.out.println(db);
    }
}
