import java.io.InputStream;
import java.net.URI;
import java.util.List;

public class App {

   // Método principal
   public static void main(String[] args) throws Exception {

      // Definindo a URL da API de conteudos //API IMDb ou NASA
      //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
      //ExtratorDeConteudo extrator = new ExtratorIMDb();

      String url = "http://localhost:8080/linguagens";
      ExtratorDeConteudo extrator = new ExtratorIMDb();

      //String url = "https://api.nasa.gov/planetary/apod?api_key=vkzi3gRo3ZdWTHhgSrbMsEvgf7aaRy8rFR5GAR3P&start_date=2022-06-10&end_date=2022-06-14";
      //ExtratorDeConteudo extrator = new ExtratorNasa();
    
      var http = new ClienteHttp();
      String json = http.buscaDados(url);

      List<Conteudo> conteudos = extrator.extraiConteudos(json);
    
      // Criando um objeto GeradoraDeFigurinhas para gerar as figurinhas
      var geradora = new GeradoraDeFigurinhas();

      // Iterando sobre a lista de conteudo e gerando as figurinhas
      for (int i = 0; i<5 ; i++) {
         Conteudo conteudo = conteudos.get(i);

         InputStream inputStream = new URI(conteudo.urlImagem()).toURL().openStream();
         String nomeArquivo = conteudo.titulo() + ".png";

         String caminhoDiretorio = "./saida/";
         String caminhoArquivo = caminhoDiretorio + nomeArquivo;
    
         geradora.criar(inputStream, caminhoArquivo);
    
         System.out.println(conteudo.titulo());
         System.out.println();
      }   
   }
}