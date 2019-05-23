package generic;

public class Coppia <T extends Comparable<T>> {
	private T primo;
	private T secondo;
	
	public T getMax() {
		switch(primo.compareTo(secondo)){
			case -1: 
				return secondo;
			case 1:
				return primo;
			case 0:
				return primo;
		}
		return primo;
	}
}
