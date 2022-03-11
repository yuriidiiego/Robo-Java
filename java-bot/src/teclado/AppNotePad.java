package teclado;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

public class AppNotePad {

  public static void main(String[] args)
    throws IOException, InterruptedException {
    try {
      Runtime.getRuntime().exec("cmd /c start notepad");

      Thread.sleep(3000);

      Robot robot = new Robot();

      Robozildo roboSoletrando = new Robozildo(robot);

      roboSoletrando.escrever(
        "Boa tarde a todos, eu me chamo Robozildo, e eu sou um fantasma e estou aqui para te ajudar a resolver seus problemas"
      );

      roboSoletrando.pressionaAltF4();
      roboSoletrando.pressionaTab(1);
      roboSoletrando.pressionarEnter();
    } catch (AWTException e) {
      e.printStackTrace();
    }
  }
}
