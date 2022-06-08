public class ProxyLoader implements ImageLoader{

	ImageLoader R;

	String s1= null;
	public String load(){
		if(s1==null) {
			System.out.println("loading from main memory");
			R= new RealLoader();
			return s1 = R.load();
		}
		else {
			
			System.out.println("loading from cache memory");
			return s1;
		}
}
}