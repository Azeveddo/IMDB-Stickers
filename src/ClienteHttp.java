import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp {
    
    String buscaDados(String url) {
        try {
            URI endereco = URI.create(url);
        // Criando um objeto HttpClient e fazendo uma requisição GET para obter os dados da API
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        return response.body();

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
