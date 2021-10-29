package examples.constructori;

public class PizzaQuatroFormaggi extends Pizza {
    int weight;

    PizzaQuatroFormaggi(int weight) {
        super(20);
        this.weight = weight;
    }

    PizzaQuatroFormaggi(){
        this.weight = 0;
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
