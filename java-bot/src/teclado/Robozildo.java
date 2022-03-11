package teclado;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Robozildo {
  private static final short DELAY = 100; // Delay entre cada tecla(1 segundo)
  private Robot robo;

  public Robozildo(Robot pRobo) {
    this.robo = pRobo;
  }

  // Método que converte uma String em um array de caracteres e pressiona cada caracter
  public void escrever(String keys) {
    char[] chars = keys.toCharArray();
    for (char caracteres : chars) {
      int codigo = KeyEvent.getExtendedKeyCodeForChar(caracteres);
      if (KeyEvent.CHAR_UNDEFINED == codigo) {
        throw new IllegalArgumentException(
          "Caractere não reconhecido: " + caracteres
        );
      }
      if (Character.isUpperCase(caracteres)) {
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.delay(Robozildo.DELAY);
        this.escreveChar(robo, codigo);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.delay(Robozildo.DELAY);
      } else {
        this.escreveChar(robo, codigo);
      }
    }
  }

  //pressiona alt+f4
  public void pressionaAltF4() {
    robo.keyPress(KeyEvent.VK_ALT);
    robo.delay(Robozildo.DELAY);
    robo.keyPress(KeyEvent.VK_F4);
    robo.delay(Robozildo.DELAY);
    robo.keyRelease(KeyEvent.VK_F4);
    robo.delay(Robozildo.DELAY);
    robo.keyRelease(KeyEvent.VK_ALT);
    robo.delay(Robozildo.DELAY);
  }

  private void escreveChar(Robot pRobo, int pCodigo) {
    pRobo.keyPress(pCodigo);
    pRobo.delay(Robozildo.DELAY);
    pRobo.keyRelease(pCodigo);
  }

  public void pressionarEnter() {
    robo.keyPress(KeyEvent.VK_ENTER);
    robo.delay(Robozildo.DELAY);
    robo.keyRelease(KeyEvent.VK_ENTER);
  }

  public void pressionaTab(int i) {
    for (int j = 0; j < i; j++) {
      robo.keyPress(KeyEvent.VK_TAB);
      robo.delay(Robozildo.DELAY);
      robo.keyRelease(KeyEvent.VK_TAB);
    }
  }

}
