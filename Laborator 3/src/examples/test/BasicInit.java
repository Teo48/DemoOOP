package examples.test;

public class BasicInit {
    private int x;
    private boolean flag;
    protected String s;
    @Override
    public String toString() {
        return x + " " + flag + " " + s;
    }
    public static void main(String []args) {
        BasicInit basicInit = new BasicInit();
        System.out.println(basicInit);
    }
}

