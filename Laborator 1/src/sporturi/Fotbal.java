package sporturi;

import java.util.Arrays;
import java.util.Objects;

public class Fotbal {
    int meciuri;

    public static void main(String[] args) {
        Fotbal f1 = new Fotbal();
        Fotbal f2 = new Fotbal();

        f1.meciuri = 10;
        f2.meciuri = 10;

        System.out.println(f1.equals(f2));
        System.out.println(f1 == f2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fotbal fotbal = (Fotbal) o;
        return meciuri == fotbal.meciuri;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meciuri);
    }
}
