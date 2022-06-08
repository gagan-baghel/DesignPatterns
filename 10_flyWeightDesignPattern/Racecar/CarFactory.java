import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	private static Map<String,RaceCar> flyweights = new HashMap<>();
	public static RaceCar getracecar(String key){
		if(flyweights.containsKey(key)) return flyweights.get(key);
		RaceCar racecar;
	switch (key) {
		case "audi":
			racecar = new FlyweightAudi();
			racecar.name="audi";
			racecar.speed=10;
			racecar.horsepower=80;
			break;
		default:
			throw new IllegalArgumentException("unsupported car type");

	}
	flyweights.put(key,racecar);
	return racecar;
	
}
}
