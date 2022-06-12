public class Follower implements Observer{
	String name;
	String intrest;
	public Follower(String name,String intrest){
		this.name= name;
		this.intrest=intrest;
	}
	@Override
	public void notification(String handle, String tweet1) {
		System.out.println(name+" you have a notification from " + handle + " -tweeted- " + tweet1 + "relatable to your intrest" + intrest );
	}
	
}
