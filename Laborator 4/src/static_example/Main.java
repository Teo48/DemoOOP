package static_example;

class Foo {
    public static void doWork() {
        System.out.print("Done! ");
    }
}

public class Main {
    public static void main(String[] args) {
        Foo f = null;
        f.doWork();
        Foo.doWork();
    }
}
