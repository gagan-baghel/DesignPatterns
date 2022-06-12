import java.util.ArrayList;
import java.util.List;
public class PopularPersonality implements Subject {
	List<Observer> obj = new ArrayList<Observer>();
	String name;
	String handle;
	PopularPersonality(String name, String handle) {
		this.name = name;
		this.handle = handle;
	}
	public void tweet(String tweet) {
		System.out.println(" Name: " + name );
		System.out.println(" posted "+ tweet);
		System.out.println(" Observer Informed ");
		snotify(tweet);
	}
	@Override
	public void addfollower(Observer o) {obj.add(o);}
	@Override
	public void removefollower(Observer o) {obj.remove(o);}
	@Override
	public void snotify(String tweet) {
		obj.forEach(obj->obj.notification(handle,tweet));
	}
}
