package examples.upcasting;

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument i = new Instrument();
        i.tune(flute);
    }
}
