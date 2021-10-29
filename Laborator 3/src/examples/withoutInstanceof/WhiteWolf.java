package examples.withoutInstanceof;

public class WhiteWolf extends Wolf {
    public static void main(String[] args) {
        // Nu se poate face asta pentru ca tipul referintei nu poate fi niciodata mai jos in lantul de mostenire decat tipul instantei referite.
        //WhiteWolf wolf       = new Wolf();
        //tipul referintei   // tipul instantei referite
    }
}
