public class Subscriber implements Observer{
	String name;
	String newspaper;
	public Subscriber(String name , String newspaper){
		this.name= name;
		this.newspaper=newspaper;
	}
	@Override
	public void notification(String handle, String currentnews) {
		System.out.println(" Dear "+name +" you have a notification from " + newspaper + " -Posted- In " + handle + " the newspaper of " + currentnews + "for premium Subscriber");
	}
}