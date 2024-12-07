package ua.edu.ucu.taskthree;

import org.json.JSONObject;
import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {

    @SneakyThrows
    public Company fetch(String companyName) {
        String API_KEY = "";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + companyName);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            System.out.println("Error: " + responseCode);
            return null;
        }

        String response = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println("Response from PDL: " + response);

        JSONObject json = new JSONObject(response);
        Company company = new Company();
        company.setName(json.optString("name", "Unknown")); // Example, parse JSON correctly
        return company;
    }
}
