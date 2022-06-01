public class YellowBird implements Cloneable{
	
	String name;
	int power;
	void set(){
		this.name = "Yellow bird";
		this.power = 70;
	}
	void display(){
		System.out.println(name);
		System.out.println(power);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}


}