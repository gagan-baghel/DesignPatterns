public class RaceCarClient {
	private RaceCar racecar;
	public RaceCarClient(String name){
		racecar = CarFactory.getracecar(name);
	}
	private int x=0;
	private int y=0;
	public void movecar(int newx,int newy){
		racecar.movecar(x,y,newx,newy);
		x=newx;
		y=newy;
	}
}
