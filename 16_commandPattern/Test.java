public class Test {
	public static void main(String args []){
		Fan f1= new Fan();
		Light l1= new Light();
		Command f = new FanOnCommand(f1);
		Command l = new LightOnCommand(l1);
		Remote r1 = new Remote();
		r1.setcommand(l);
		r1.pressbutton();
		Remote r2 = new Remote();
		r2.setcommand(f);
		r2.pressbutton();
	}
}
