package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        var hexaObserver = new HexaObserver();
        var octalObserver = new OctalObserver();
        var binaryObserver = new BinaryObserver();

        subject.addObserver(hexaObserver);
        subject.addObserver(octalObserver);
        subject.addObserver(binaryObserver);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}