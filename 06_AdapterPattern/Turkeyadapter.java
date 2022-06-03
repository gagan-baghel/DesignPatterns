public class Turkeyadapter implements Duck {
	Turkey t;
	Turkeyadapter(Turkey t) {
		this.t = t;
	}
	@Override
	public void fly() {
		int i = 5;
		while (i > 0) {
			t.fly();
			i--;
		}
	}

	@Override
	public void quack() {
		t.gobble();
	}

}
