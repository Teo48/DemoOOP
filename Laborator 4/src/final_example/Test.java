package final_example;

class Student {
    int varsta;
    String nume;

    public Student(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        final Student s = new Student(10, "Gigel");
        final int x = 5;

        //s = new Student(20, "Dorel");
        System.out.println(s);
        s.varsta = 20;
        System.out.println(s);
    }
}
