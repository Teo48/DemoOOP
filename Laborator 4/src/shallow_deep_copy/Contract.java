package shallow_deep_copy;

public class Contract {
    Student student;
    int nrContract;

    /**
     * Constructor default. Retinem ca daca declaram in clasa orice alt constructor, atunci
     * cel default va fi ascuns si va trebui definit in mod explicit de catre noi.
     * */
    public Contract() {}

    /**
     *	Constructor parametrizat. Hint: Puteti folosi Intellij pentru generarea constructorilor.
     *	Shortcut: ALT + C + Insert si va deschide automat o lista de metode pe care le poate genera.
     * */
    public Contract(Student student, int nrContract) {
        this.student = student;
        this.nrContract = nrContract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "student=" + student.name +
                ", nrContract=" + nrContract +
                '}';
    }
}
