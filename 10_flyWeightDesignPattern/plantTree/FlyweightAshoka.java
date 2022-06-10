
public class FlyweightAshoka extends Tree {
	public static int num=0;
	public FlyweightAshoka(){
		num++;
	}
	public void place(int currx,int curry,int newx,int newy){
		System.out.println("location of tree is :-  " + newx +" "+ newy);
	}

}