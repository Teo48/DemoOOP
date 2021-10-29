package examples.constructori;

public class Pizza  extends Food {
    int size;

    Pizza() {

    }

    Pizza(int size) {
        super(20);
        this.size = 15;
    }
    // Pizza p = new Pizza(3);
    // Pizza p = new Pizza();
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

