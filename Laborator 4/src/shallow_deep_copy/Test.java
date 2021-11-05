package shallow_deep_copy;

public class Test {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    /**
     * Modificarea va fi vizibila dupa apelul functiei, deoarece referinta indica spre zona de memorie a obiectului,
     * astfel ca schimbarile asupra campurilor vor fi vizibile dupa apel
     * */
    public static void changeName(Student st) {
        st.name = "Ana";
    }

    /**
     * Dupa reinstantiere, orice modificare facuta asupra referintei nu va fi vizibila dupa executia apelului
     * de functie.
     * */
    public static void changeReference(Student st) {
        st = new Student("Ionel", 20, 10.0, new Contract());
        st.name = "Ana";
    }

    public static void main(String [] args) {
        Student student1 = new Student();
        student1.showStudent();
        Student student2 = new Student("Gigel", 20, 10.0, new Contract());
        student2.showStudent();
        System.out.println("===========================");
        Student student3 = new Student(student2);
        student3.showStudent();
        System.out.println("===========================");
        Student student4 = new Student("Maria", new Contract());
        student4.showStudent();
        System.out.println("===========================");
        Contract c = student2.getContract();
        student2.contract = c;

        Student student5 = new Student(student2);
        student2.showStudent();
        System.out.println("===========================");
        student5.showStudent();
        System.out.println("===========================");
        student2.contract.nrContract = 37;
        student5.showStudent();
        System.out.println("===========================");
        int x = 5;
        int y = 3;
        swap(x, y);
        System.out.println(x + ": " + y);

        student2.showStudent();
        // In urma apelului, se va observa schimbarea numelui
//		changeName(student2);
        // In urma apelului, nu se va observa nicio schimbare
        changeReference(student2);
        student2.showStudent();
        System.out.println(c);
    }
}
