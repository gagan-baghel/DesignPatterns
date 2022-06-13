public class Test {
	public static void main(String args[]){
		Student s1=new Student();
		Gallary gallary= new Gallary();

		s1.setstate("state #1");
		// gallary.add(s1.savetomemento());
		s1.setstate("state #2");
		gallary.add(s1.savetomemento());
		s1.setstate("state #3");
		gallary.add(s1.savetomemento());
		s1.setstate("state #4");
		System.out.println("Current state"+ s1.getstate());

		s1.getstateformemento(gallary.get(0));
		System.out.println("first saves state"+ s1.getstate());

	}
	
}
