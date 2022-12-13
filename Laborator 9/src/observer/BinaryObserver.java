package observer;

import java.util.Observable;
import java.util.Observer;

public class BinaryObserver implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    System.out.println( "Binary String: " + Integer.toBinaryString((Integer) arg));
  }
}
