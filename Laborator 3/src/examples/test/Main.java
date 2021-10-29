package examples.test;

class Main {
    public static void main(String[] args) {
        Boolean b = new Boolean(true);
        if (b.equals(true)) {
            System.out.println("1");
            b = false;
            if (b == new Boolean(false)) {
                System.out.println("2");
            }
        }
    }
}
