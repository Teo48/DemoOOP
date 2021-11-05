package shallow_deep_copy;

import java.util.Random;

public class Student {
    String name;
    int age;
    double average;
    Contract contract;

    public Student() {}

    /**
     * Copy-constructor. In cazul de fata se face un deep-copy.
     * Pentru shallow-copy e decomentati bucata de mai jos, si comentati-o pe cealalta.
     * */
    public Student(Student otherStudent) {
        name = otherStudent.name;
        age = otherStudent.age;
        average = otherStudent.average;
        // contract = otherStudent.contract;
        contract = new Contract(otherStudent, otherStudent.contract.nrContract);
    }

    public Student(String name, int age, double average, Contract contract) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.contract = contract;
    }

    /**
     * Apelul constructorului this(). El trebuie neaparat sa fie prima instructiune din corpul unui constructor.
     * */
    public Student(String name, Contract contract) {
        this(name, 20, 10.0, contract);
    }

    public Contract getContract() {
        return new Contract(this, new Random().nextInt(100));
    }

    public void showStudent() {
        System.out.printf("Name: %s\nAge: %d\nAverage: %f\n", name, age, average);
        // Ignorati partea asta, e pusa ca sa puteti rula showStudent pe primele modele de studenti create
        // cu ajutorul constructorului default
        try {
            System.out.println(this.contract.nrContract);
        } catch (NullPointerException e) {}
    }
}