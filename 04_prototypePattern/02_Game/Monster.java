abstract class Monster implements Cloneable {
	String id;
	String name;
	void setid(String id) {
		this.id = id;
	}
	void setname(String name) {
		this.name = name;
	}
	String getid() {
		return id;
	}
	String getname() {
		return name;
	}
	abstract void move();
	public Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch(CloneNotSupportedException c){
			System.out.println(" excepion catch ");
		}
		return clone;
	}
}
