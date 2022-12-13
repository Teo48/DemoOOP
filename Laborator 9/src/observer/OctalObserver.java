package observer;

import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Octal String: " + Integer.toOctalString((Integer) arg));
  }
}
