public class Test {
	public static void main(String [] args){
		Duck d= new MallandDuck();
		testduck(d);
		Turkey t = new WildTurkey();
		Duck ta = new  Turkeyadapter(t);
		testduck(ta);
	}

	static void testduck(Duck d){
		d.quack();
		d.fly();
	}
	
}
	
