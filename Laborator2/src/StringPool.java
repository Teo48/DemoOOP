public class StringPool {
	public static void main(String [] args) {
		/**
		 * In java, stringurile sunt imutabile.
		 * s1 si s2 sunt referinte catre acelasi obiect.
		 * Dupa append la s1, se creeaza un nou String care ii este atribuit lui s1.
		 *
		 * La instantierea lui s3, se aloca un nou String "Ana are mere" pe heap.
		 * In string pool nu va mai fi alocat, deoarece exista deja.
		 *
		 * V-am lasat mai jos un print cu adresele lor in memorie ca sa puteti vedea exact
		 * ce refera.
		 * */
		String s1 = "Ana are mere";
		System.out.println("s1: 0x" + Integer.toHexString(System.identityHashCode(s1)));
		s1 += "gashga";
		System.out.println("s1 dupa append: 0x" + Integer.toHexString(System.identityHashCode(s1)));
		String s2 = "Ana are mere";
		System.out.println("s2: 0x" + Integer.toHexString(System.identityHashCode(s2)));
		String s3 = new String("Ana are mere");
		System.out.println("s3: 0x" + Integer.toHexString(System.identityHashCode(s3)));

		System.out.println(s1 == s3);

		/**
		 * Cate string-uri vor fi alocate?
		 * Depinde. 1 sau 2. Daca "Gigel" a fost alocat anterior si se afla in String Pool,
		 * atunci se va aloca un String "Gigel" doar pe heap, altfel, se vor aloca 2 String-uri
		 * unul pe heap, iar altul in String Pool.
		 * */
		String s4 = new String("Gigel");
	}
}
