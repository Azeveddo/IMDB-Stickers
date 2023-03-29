import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {

   // Método principal
public static void main(String[] args) throws Exception {

    // Definindo a URL da API com a lista dos top 250 filmes
    String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
    URI endereco = URI.create(url);

    // Criando um objeto HttpClient e fazendo uma requisição GET para obter os dados da API
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder(endereco).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    String body = response.body();

    // Criando um objeto JsonParser e extraindo somente os dados relevantes
    var parser = new JsonParser();
    List<Map<String, String>> listaDeFilmes = parser.parse(body);

    // Criando um objeto GeradoraDeFigurinhas para gerar as figurinhas
    var geradora = new GeradoraDeFigurinhas();

    // Iterando sobre a lista de filmes e gerando as figurinhas
    for (Map<String,String> filme : listaDeFilmes) {
        String urlImagem = filme.get("image");
        String titulo = filme.get("title");
        InputStream inputStream = new URL(urlImagem).openStream();
        
        String nomeArquivo = titulo + ".png";
        String caminhoDiretorio = "alura-stickers/saida/";
        String caminhoArquivo = caminhoDiretorio + nomeArquivo;
    
        geradora.criar(inputStream, caminhoArquivo);
    
        System.out.println(titulo);
        System.out.println();
        }   
    }
}