import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorNasa implements ExtratorDeConteudo {
    
    public List<Conteudo> extraiConteudos (String json) {

        // Criando um objeto JsonParser e extraindo somente os dados relevantes
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        // Populando a lista de conteúdos
        List<Conteudo> conteudos = new ArrayList<>();
        for(Map<String, String> atributos : listaDeAtributos){
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("url");
            Conteudo conteudo = new Conteudo(titulo, urlImagem);
            conteudos.add(conteudo);
        }

        return List.copyOf(conteudos);
    }
}