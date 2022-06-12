public class Test {
		public static void main(String [] args){
		Observer o= new Subscriber(" gagan "," Dainak Bhaskar ");
		Observer o1= new Subscriber(" Aman "," Dainak Bhaskar ");
		NewspaperCompany p = new NewspaperCompany(" Dainak Bhaskar "," Dainik Bhaskar Online ");
		p.addfollower(o);
		p.addfollower(o1);
		p.Currentnews(" 1/12/2022 ");
		p.removefollower(o1);
		p.Currentnews(" 2/12/2022 ");
	}
}
//Currentnews agency