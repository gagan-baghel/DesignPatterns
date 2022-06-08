import java.text.spi.NumberFormatProvider;
public class Test {
	public static void main(String args[]){
		RaceCarClient racecar[]={new RaceCarClient("audi")};
		racecar[0].movecar(10,20);
		System.out.println("audi car instance" + FlyweightAudi.num);
	}
	
}
