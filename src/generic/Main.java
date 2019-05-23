package generic;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static <T extends Comparable<T>> List<T> eliminaSecondo(List<T> luigi, T pippo) {
		boolean isTrovato = false;
		for (T o : luigi) {
			if (o.compareTo(pippo) == 0) {
				if (isTrovato) {
					luigi.remove(o);
					return luigi;
				}
				isTrovato = true;
			}
		}
		return null;
	}

}
