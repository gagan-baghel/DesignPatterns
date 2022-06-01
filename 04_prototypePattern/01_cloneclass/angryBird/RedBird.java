public class RedBird implements Cloneable{
	
		String name;
		int power;
		void set(){
			this.name = "red bird";
			this.power = 100;
		}
		void display(){
			System.out.println(name);
			System.out.println(power);
		}
		protected Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	
	
}
