import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.io.File;
import java.awt.Font;
import java.awt.Color;

public class GeradoraDeFigurinhas  {
    
    // Método que cria uma nova imagem com o nome especificado, a partir de uma imagem original e um input stream
public void criar(InputStream inputStream, String nomeArquivo) throws Exception {

    // Lê a imagem original a partir do input stream
    BufferedImage imagemOriginal = ImageIO.read(inputStream);

    // Obtém a largura e altura da imagem original
    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();

    // Adiciona uma altura maior para a nova imagem que será criada
    int novaAltura = altura + 200;

    // Cria uma variável que vai adicionar a nova imagem transparente por cima da imagem original
    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, Transparency.TRANSLUCENT);
    Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();

    // Desenha a imagem original na nova imagem
    graphics.drawImage(imagemOriginal, 0, 0, null);

    // Configura a fonte e cor do texto a ser adicionado na imagem
    var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
    graphics.setColor(Color.YELLOW);
    graphics.setFont(fonte);

    // Adiciona o texto na nova imagem, na posição especificada
    graphics.drawString("TOPZERA", 170, novaAltura - 100);

    // Escreve a nova imagem em um arquivo com o nome especificado
    ImageIO.write(novaImagem, "png", new File(nomeArquivo));
    }  
}
