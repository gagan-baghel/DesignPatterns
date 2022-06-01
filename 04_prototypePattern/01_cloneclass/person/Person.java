class Person implements Cloneable{
	String name;
	int age;
	void set(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display(){
		System.out.println(name);
		System.out.println(age);
	}
	 protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}