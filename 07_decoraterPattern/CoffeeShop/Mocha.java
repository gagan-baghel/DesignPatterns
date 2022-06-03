public class Mocha extends Topping{
	Coffee c;
	Mocha(Coffee c){
		this.c=c;
	}
	String getdescription(){
		return (c.getdescription() +" With Mocha ");
	}
	double cost(){
		double coffeecost = c.cost();
		return coffeecost + 40;
	}
}
