package printuri;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println(1 + 1); //2
        System.out.println(2 + "mama"); //2mama
        System.out.println(1 + 2 + 3 + "tata"); //6tata
        System.out.println(1 + "gigel" + 4); //1gigel4
        System.out.println("dorel" + 5 + 6); //dorel56

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);

        for (int i = 0; i < 5; ++i) {
            arr.add(i);
           // System.out.println(arr.get(i)); // arr[i]
        }

    }
}
