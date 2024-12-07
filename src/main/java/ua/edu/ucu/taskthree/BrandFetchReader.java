package ua.edu.ucu.taskthree;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import lombok.SneakyThrows;

public class BrandFetchReader {
    public static final String BRAND_FETCH_URL
     = "https://api.brandfetch.io/v2/brands/";
    public static final String API_KEY = " ";

    @SneakyThrows
    public Company fetch(String companyName) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(BRAND_FETCH_URL + companyName))
                .header("Authorization", "Bearer " + API_KEY)
                .build();

        HttpResponse<String> response = client
        .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        return new Company();
    }
}
