package examples.exampleprotected2;

import examples.exampleprotected.Persoana;

public class Profesor extends Persoana {
    public static void main(String[] args) {
        // V-am scris la lab Persoana p in loc de Profesor p, sorry. Mi-am dat seama dupa. Ideea era sa vedeti ca dintr-o clasa copil a
        // clasei Persoana se pot accesa campurile si metodele cu protected, asa cum se intampla in randurile de mai jos.
        // Am pus si clasa intr-un alt pachet ca sa fie mai sugestiv exemplul, sa vedeti ca pot fi accesate de oriunde campurile cu protected,
        // atata timp cat ma aflu intr-o clasa copil a clasei Persoana.
        Profesor p = new Profesor();
        p.varsta = 30;
        p.afisareVarsta();
    }
}
