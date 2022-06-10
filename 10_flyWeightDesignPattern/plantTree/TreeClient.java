
public class TreeClient {
	private Tree tree;
	public TreeClient(String name){
		tree = TreeFactory.gettree(name);
	}
	private int x=0;
	private int y=0;
	public void place(int newx,int newy){
		tree.place(x,y,newx,newy);
		x=newx;
		y=newy;
	}
}
