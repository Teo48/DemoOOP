package examples;

class PropertiesExample {
    String myString;

    String getMyString() {
        return myString;
    }

    void setMyString(String s) {
        myString = s;
    }

    public static void main(String[] args) {
        PropertiesExample pe = new PropertiesExample();

        pe.setMyString("This is my string!");

        System.out.println(pe.getMyString());
    }
}