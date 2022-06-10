public class Testt {
	public static void main(String args[]){
		TreeClient Mtree[]={new TreeClient("Mango")};
		Mtree[0].place(10,20);
		System.out.println("Mango tree instance " + FlyweightMango.num);
		TreeClient Atree[]={new TreeClient("Ashoka")};
		Atree[0].place(30,40);
		System.out.println("Ashoka tree instance " + FlyweightMango.num);
	}
	
}
