public class StarBucks {
	public static void main(String [] args){
		Coffee expresso = new Expresso();
		Coffee mocha = new Mocha(expresso);
		System.out.println(mocha.getdescription());
		System.out.println( " Rs : " +mocha.cost());

		Coffee houseblend = new HouseBlend(expresso);
		System.out.println(houseblend.getdescription());
		System.out.println( " Rs : " +houseblend.cost());

		Coffee darkrose = new Darkrose(expresso);
		System.out.println(darkrose.getdescription());
		System.out.println( " Rs : " +darkrose.cost());
	}

}
