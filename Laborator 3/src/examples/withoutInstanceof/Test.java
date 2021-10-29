package examples.withoutInstanceof;

class Test {
    public static void main(String[] args) {
        Animal a [] = new Animal[2];

        a[0] = new Wolf();
        a[1] = new Snake();

        for (int i = 0; i < a.length; i++) {
            a[i].eat();

            // acum că ele sunt numite la fel, putem apela metoda action
            // din clasa Animal (observați de ce a fost nevoie să definim
            // metoda action în clasa Animal), iar metoda corespunzătoare
            // va fi apelată pentru tipul specific al instanței a[i]

            a[i].action();
        }
    }
}
