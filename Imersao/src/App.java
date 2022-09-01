import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "https://imdb-api.com/en/API/Top250Movies/k_8tjfnzz3";
        URI local_url = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(local_url).GET().build();
        // client.send(, responseBodyHandler)

    }
}
