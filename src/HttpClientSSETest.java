import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;

public class HttpClientSSETest {

    @Test
    public void receiveEvents() throws URISyntaxException, IOException, InterruptedException {
        var uri = new URI("https://postman-echo.com/get?test=123");
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).GET().build();
        var lines = client.send(request, BodyHandlers.ofLines()).body();
        lines.forEach(System.out::println);
    }
}
