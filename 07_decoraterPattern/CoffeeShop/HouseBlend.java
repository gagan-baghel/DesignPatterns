public class HouseBlend extends Topping{
	Coffee c;
	HouseBlend(Coffee c){
		this.c=c;
	}
	String getdescription(){
		return (c.getdescription() +" With HouseBlend");
	}
	double cost(){
		double coffeecost = c.cost();
		return coffeecost + 70;
	}
}