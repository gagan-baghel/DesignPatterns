import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static Map<String,Tree> flyweights = new HashMap<>();
	public static Tree gettree(String key){
		if(flyweights.containsKey(key)) return flyweights.get(key);
		Tree tree;
	switch (key) {
		case "Mango":
			tree = new FlyweightMango();
			tree.name="Mango";
			tree.width=10;
			tree.color="green";
			break;
		case "Ashoka":
			tree = new FlyweightMango();
			tree.name="Ashoka";
			tree.width=10;
			tree.color="dark green";
			break;		
		default:
			throw new IllegalArgumentException("unsupported tree type");

	}
	flyweights.put(key,tree);
	return tree;
	
}
}
