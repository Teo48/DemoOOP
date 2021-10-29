package examples.upcasting;

class Instrument {
    public void play() {
        System.out.println("Ana are mere");
    }

    void tune(Instrument i) {
        i.play();
    }
}
