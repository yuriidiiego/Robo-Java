package teclado;

import java.awt.*;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AppCmd {

  public static void main(String[] args)
    throws AWTException, IOException, InterruptedException {
    try {
      abreStackOverFlow();
      Thread.sleep(3000);
      // Caso ocorra algum erro, exibe uma mensagem
    } catch (InterruptedException e) {
      JOptionPane.showMessageDialog(
        null,
        "Erro ao executar o comando",
        "Erro",
        JOptionPane.ERROR_MESSAGE
      );
    }

    // Cria um objeto do tipo Robot e espera um segundo
    Robot robo = new Robot();
    robo.delay(1000);

    // Instancia um objo da classe RoboSoletrando
    Robozildo roboSoletrando = new Robozildo(robo);
    roboSoletrando.pressionaTab(2);
    roboSoletrando.escrever("Como fazer um Hello World em Java");
    roboSoletrando.pressionarEnter();
    Thread.sleep(3000);

    abreNotPad();
    robo.delay(2000);
    roboSoletrando.escrever("Obrigado pela atencao de voces");

    // Abre o youtube e espera 
    abreYouTube();
    Thread.sleep(3000);
  }

  private static void abreYouTube() throws IOException {
    Runtime
      .getRuntime()
      .exec("cmd /c start https://www.youtube.com/shorts/uw35D9IfaJ8orld");
  }

  private static void abreNotPad() throws IOException {
    Runtime.getRuntime().exec("cmd /c start notepad");
  }

  private static void abreStackOverFlow() throws IOException {
    Runtime.getRuntime().exec("cmd /c start https://pt.stackoverflow.com/");
  }
}
