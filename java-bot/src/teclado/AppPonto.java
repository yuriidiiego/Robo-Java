package teclado;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;


public class AppPonto {

  public static void main(String[] args)
    throws AWTException, IOException, InterruptedException {
    abrePontoMais();
    verificaHorarioPonto();
    Thread.sleep(3000);
  }

  private static void verificaHorarioPonto()
    throws InterruptedException, AWTException {
    if (horarioDeTrabalho()) {
      Thread.sleep(5000);
      batePonto();
    } else {
      Thread.sleep(3000);
      JOptionPane.showMessageDialog(
        null,
        "Nao pode bater ponto ainda, horario de trabalho nao iniciado",
        "Erro",
        JOptionPane.ERROR_MESSAGE
      );
      if (
        JOptionPane.showConfirmDialog(
          null,
          "Deseja esperar o horario de trabalho?",
          "Não",
          JOptionPane.YES_NO_OPTION
        ) ==
        JOptionPane.YES_OPTION
      ) {
        abreYouTube();
      }
      System.exit(0);
    }
  }

  private static void abreYouTube() {
    try {
      Runtime
        .getRuntime()
        .exec("cmd /c start https://www.youtube.com/watch?v=blJSZmhu7ug");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void batePonto() throws InterruptedException, AWTException {
    Thread.sleep(4000); // Espera 4 segundos
    Robot robo = new Robot(); // Cria um objeto do tipo Robot
    robo.delay(1000); // Espera um segundo
    Robozildo robozildo = new Robozildo(robo); // Instancia um objo da classe RoboSoletrando
    robozildo.pressionaTab(9); // Aperta tab 9 vezes
    robozildo.pressionarEnter();
  }

  private static boolean horarioDeTrabalho() {
    String horario = new SimpleDateFormat("HH:mm")
    .format(new java.util.Date());
    return (
      horario.equals("9") ||
      horario.equals("12:30") ||
      horario.equals("14") ||
      horario.equals("17")
    );
  }

  private static void abrePontoMais() throws IOException {
    Runtime
      .getRuntime()
      .exec(
        "cmd /c start https://app.pontomaisweb.com.br/#/meu_ponto/registro_de_ponto"
      );
  }
}

