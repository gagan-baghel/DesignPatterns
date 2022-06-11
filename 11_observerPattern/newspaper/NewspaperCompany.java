import java.util.ArrayList;
import java.util.List;
public class NewspaperCompany implements Subject {
	List<Observer> obj = new ArrayList<Observer>();
	String name;
	String handle;
	NewspaperCompany(String name, String handle) {
		this.name = name;
		this.handle = handle;
	}
	public void Currentnews(String Currentnews) {
		System.out.println(" Name: " + name );
		System.out.println(" posted Current news of "+ Currentnews);

		System.out.println("Observer Informed ");
		snotify(Currentnews);
	}
	@Override
	public void addfollower(Observer o) {obj.add(o);}
	@Override
	public void removefollower(Observer o) {obj.remove(o);}
	@Override
	public void snotify(String Currentnews){
		obj.forEach(obj->obj.notification(handle,Currentnews));
	}
}
