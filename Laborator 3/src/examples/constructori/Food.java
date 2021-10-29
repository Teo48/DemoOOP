package examples.constructori;

public class Food {
    int cal;

    Food() {
        this.cal = 0;
    }

    Food(int cal) {
        this.cal = cal;
    }
}
/*
 * Lant de Mostenire:
 *                    Food
 *                     |
 *                   Pizza
 *                   /  \
 * PizzaQuatroFormaggi, PizzaStagione
 *       |
 * GrandePizzaQuatroFormaggi
 * */
