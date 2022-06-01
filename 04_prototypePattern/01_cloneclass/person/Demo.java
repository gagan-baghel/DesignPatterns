public class Demo {
	public static void main(String [] args){
		Person p = new Person();
		p.set("maxwell", 10 );
		p.display();
		try {
			Person p2 = (Person)p.clone();
			p2.display();
		}
		catch(Exception c ){

		}
	}
}
