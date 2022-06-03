public class Darkrose extends Topping{
	Coffee c;
	Darkrose(Coffee c){
		this.c=c;
	}
	String getdescription(){
		return (c.getdescription() +" With Darkrose");
	}
	double cost(){
		double coffeecost = c.cost();
		return coffeecost + 99;
	}
}