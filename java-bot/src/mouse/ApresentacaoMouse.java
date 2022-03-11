package mouse;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ApresentacaoMouse {

  public static void main(String[] args) throws AWTException {
    Robot robo = new Robot(); // Cria um objeto do tipo Robot

    robo.setAutoDelay(1000); // Define o tempo de espera entre cada acao
    robo.mouseMove(2000, 100); // Move o mouse para a posição (100, 100)
    robo.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Pressiona o botão esquerdo do mouse
    robo.mouseMove(2000, 100); // Move o mouse para de po
    robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Solta o botão esquerdo do mouse
    robo.mouseWheel(-1000); // Roda a roda do mouse para trás
    robo.mouseWheel(1000); // Roda a roda do mouse para frente

  }
}
