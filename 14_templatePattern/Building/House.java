public class House extends Structure {

	House(){
		System.out.println("For making house***");
	}
	@Override
	public void base(){
		System.out.println("Making Simple base....");
	}
	@Override
	public void wall(){
		System.out.println("Making Single brick wall....");
	}
	@Override
	public void window(){
		System.out.println("Adding Hinj Window.....");
	}
	@Override
	public void door(){
		System.out.println("Making Single door.....");
	}
	@Override
	public void interiordesign(){
		System.out.println("Designing the interior with normal flowers.....");
	}
	
}
