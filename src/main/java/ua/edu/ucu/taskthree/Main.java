package ua.edu.ucu.taskthree;

public class Main {
    public static void main(String[] args) {
        CompanyReaderFacade facade = new CompanyReaderFacade();
        Company company = facade.fetch("ucu.edu.ua");
        System.out.println("Company: " + company.getName());
        System.out.println("Description: " + company.getDescription());
    }
}
