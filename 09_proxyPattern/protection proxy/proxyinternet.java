class proxyinternet implements Internet {
	String empname;
	int role;
	
	proxyinternet(String empname, int role) {
		this.empname = empname;
		this.role = role;
	}
	
	public void request(){
		if (role < 3) {
			RealInternet R= new RealInternet();
			R.request();
		} else
			System.out.println("Second level internet");
	}
}
