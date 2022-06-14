public class Tea extends Beverage {

	public void serve() {
		System.out.println("serving Tea..");
	}

	@Override
	public void addtopping() {
		System.out.println("adding Tea..");
	}
}