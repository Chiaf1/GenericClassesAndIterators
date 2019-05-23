package generic;

public class Ilbello implements Comparable<Ilbello> {
	private int bello;

	public Ilbello(int bello) {
		this.bello = bello;
	}

	public int getBello() {
		return bello;
	}
	
	public void setBello(int bello) {
		this.bello = bello;
	}

	@Override
	public int compareTo(Ilbello o) {
		if (o.getBello() == bello) {
			return 0;
		}
		if (o.getBello() < bello) {
			return 1;
		} else {
			return -1;
		}
	}

}
