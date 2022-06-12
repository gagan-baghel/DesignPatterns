public class Test {
		public static void main(String [] args){
		Observer o= new Follower(" gagan "," shoe ");
		Observer o1= new Follower(" Aman "," shoe ");
		PopularPersonality p =new PopularPersonality(" Brand Nike "," Nike_shoe_shop ");
		p.addfollower(o);
		p.addfollower(o1);
		p.tweet(" Airbag shoes ");
		p.removefollower(o1);
		p.tweet(" Airbag shoes ");
	}
}
//newspaper agency