public class Demo {
	public static void main(String [] args){
		RedBird p = new RedBird();
		YellowBird p1 = new YellowBird();
		p.set();
		p.display();
		p1.set();
		p1.display();
		try {
			RedBird p2 = (RedBird)p.clone();
			p2.display();
			YellowBird p3 = (YellowBird)p1.clone();
			p3.display();
		}
		catch(CloneNotSupportedException c ){

		}
		





	}
}
