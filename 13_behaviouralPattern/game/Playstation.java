import java.util.ArrayList;
import java.util.List;

public class Playstation {
	private List<Memento> memolist= new ArrayList<Memento>();
	public void add(Memento state){
		memolist.add(state);
	}
	public Memento get(int idx){
		return memolist.get(idx);
	}
	

	
}
