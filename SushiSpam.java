import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.io.*;

public class SushiSpam {

  public static void main(String[] args) throws IOException,
                           AWTException, InterruptedException {

    String message = "@Sushanth Mukkamalla congrats on your new job";

    // Create an instance of Robot class
    Robot robot = new Robot();

    robot.mouseMove(900, 1020);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK); 


    for (int i = 0; i < 10; i++) {

      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_2);
      robot.keyRelease(KeyEvent.VK_2);
      robot.keyRelease(KeyEvent.VK_SHIFT);

      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_S);
      robot.keyRelease(KeyEvent.VK_S);
      robot.keyRelease(KeyEvent.VK_SHIFT);

      robot.keyPress(KeyEvent.VK_U);
      robot.keyRelease(KeyEvent.VK_U);

      robot.keyPress(KeyEvent.VK_S);
      robot.keyRelease(KeyEvent.VK_S);

      robot.keyPress(KeyEvent.VK_H);
      robot.keyRelease(KeyEvent.VK_H);

      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);

      robot.keyPress(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_N);

      robot.keyPress(KeyEvent.VK_T);
      robot.keyRelease(KeyEvent.VK_T);

      robot.keyPress(KeyEvent.VK_H);
      robot.keyRelease(KeyEvent.VK_H);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_M);
      robot.keyRelease(KeyEvent.VK_M);
      robot.keyRelease(KeyEvent.VK_SHIFT);

      robot.keyPress(KeyEvent.VK_U);
      robot.keyRelease(KeyEvent.VK_U);

      robot.keyPress(KeyEvent.VK_K);
      robot.keyRelease(KeyEvent.VK_K);

      robot.keyPress(KeyEvent.VK_K);
      robot.keyRelease(KeyEvent.VK_K);

      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);

      robot.keyPress(KeyEvent.VK_M);
      robot.keyRelease(KeyEvent.VK_M);

      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);

      robot.keyPress(KeyEvent.VK_L);
      robot.keyRelease(KeyEvent.VK_L);

      robot.keyPress(KeyEvent.VK_L);
      robot.keyRelease(KeyEvent.VK_L);

      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);

      Thread.sleep(500);

      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_C);
      robot.keyRelease(KeyEvent.VK_C);

      robot.keyPress(KeyEvent.VK_O);
      robot.keyRelease(KeyEvent.VK_O);

      robot.keyPress(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_N);

      robot.keyPress(KeyEvent.VK_G);
      robot.keyRelease(KeyEvent.VK_G);

      robot.keyPress(KeyEvent.VK_R);
      robot.keyRelease(KeyEvent.VK_R);

      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);

      robot.keyPress(KeyEvent.VK_T);
      robot.keyRelease(KeyEvent.VK_T);

      robot.keyPress(KeyEvent.VK_S);
      robot.keyRelease(KeyEvent.VK_S);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_O);
      robot.keyRelease(KeyEvent.VK_O);

      robot.keyPress(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_N);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_Y);
      robot.keyRelease(KeyEvent.VK_Y);

      robot.keyPress(KeyEvent.VK_O);
      robot.keyRelease(KeyEvent.VK_O);

      robot.keyPress(KeyEvent.VK_U);
      robot.keyRelease(KeyEvent.VK_U);

      robot.keyPress(KeyEvent.VK_R);
      robot.keyRelease(KeyEvent.VK_R);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_N);

      robot.keyPress(KeyEvent.VK_E);
      robot.keyRelease(KeyEvent.VK_E);

      robot.keyPress(KeyEvent.VK_W);
      robot.keyRelease(KeyEvent.VK_W);


      robot.keyPress(KeyEvent.VK_SPACE);
      robot.keyRelease(KeyEvent.VK_SPACE);


      robot.keyPress(KeyEvent.VK_J);
      robot.keyRelease(KeyEvent.VK_J);

      robot.keyPress(KeyEvent.VK_O);
      robot.keyRelease(KeyEvent.VK_O);

      robot.keyPress(KeyEvent.VK_B);
      robot.keyRelease(KeyEvent.VK_B);


      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);


      Thread.sleep(1000);
    }

  }

}
