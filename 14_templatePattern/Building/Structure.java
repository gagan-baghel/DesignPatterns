abstract class Structure {
	abstract public void base();
	abstract public void wall();
	abstract public void window();
	abstract public void door();
	public void painting(){
		System.out.println("Painting colour.......");
	}
	abstract public void interiordesign();

	public final void making(){
		base();
		wall();
		window();
		door();
		painting();
		interiordesign();
	}

	
}
