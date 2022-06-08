public class FlyweightAudi extends RaceCar {
	public static int num=0;
	public FlyweightAudi(){
		num++;
	}
	public void movecar(int currx,int curry,int newx,int newy){
		System.out.println("new location is" + newx +" "+ newy);
	}
	public void display(){
		System.out.println(name);
		System.out.println(speed);
		System.out.println(horsepower);
	}

}
