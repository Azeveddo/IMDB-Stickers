import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorIMDb implements ExtratorDeConteudo{
    public List<Conteudo> extraiConteudos (String json) {

        // Criando um objeto JsonParser e extraindo somente os dados relevantes
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();
        
        // Populando a lista de conteúdos
        for(Map<String, String> atributos : listaDeAtributos){
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("image").replaceAll("(@+)(.*).jpg$","$1.jpg");
            Conteudo conteudo = new Conteudo(titulo, urlImagem);
            conteudos.add(conteudo);
        }
        return List.copyOf(conteudos);
    }
}
