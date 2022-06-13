public class Student {
	private String state;

	public void setstate(String state) {
		this.state = state;
	}

	public String getstate() {
		return state;
	}

	public Memento savetomemento() {
		return new Memento(state);
	}

	public void getstateformemento(Memento memento) {
		state = memento.getstate();
	}
}