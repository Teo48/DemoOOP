package observer;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hexa String: " + Integer.toHexString((Integer) arg));
    }
}

