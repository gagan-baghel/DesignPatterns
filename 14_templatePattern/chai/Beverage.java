public abstract class Beverage {

	public void boil() {
		System.out.println("boiling water..");
	}

	public void pourmilk() {
		System.out.println("pouring milk.. ");
	}

	public void addsugar() {
		System.out.println("adding sugar..");
	}

	public void pourincup() {
		System.out.println("pouring in cup..");
	}

	abstract void serve();
	abstract void addtopping();

	public  void played(){
		boil();
		pourmilk();
		addsugar();
		addtopping();
		pourincup();
		serve();
	}
}
