public class PrimeMinister {
	static PrimeMinister pm;
	private PrimeMinister() {
	}
	void setrule() {
		System.out.println("setting rule ");
	}
	void givepermission() {
		System.out.println("giving permission ");
	}
	static PrimeMinister createprimeminister() {
		if (pm == null) {
			pm = new PrimeMinister();
		}
		return pm;
	}

}
