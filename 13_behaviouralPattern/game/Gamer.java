public class Gamer {
	private String level;

	public void setlevel(String level) {
		this.level = level;
	}

	public String getlevel() {
		return level;
	}

	public Memento savetomemento() {
		return new Memento(level);
	}

	public void getlevelformemento(Memento memento) {
		level = memento.getlevel();
	}
}