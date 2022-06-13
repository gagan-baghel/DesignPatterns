class Demo {
	static ATMHandler createChain() {
		ATMHandler twothousand= new TwoThousand();
		ATMHandler fivehundred= new FiveHundred();
		ATMHandler twohundred= new TwoHundred();
		ATMHandler hundred= new Hundred();
		twothousand.setnextHandler(fivehundred);
		fivehundred.setnextHandler(twohundred);
		twohundred.setnextHandler(hundred);
		return (twothousand);
	}
	public static void main(String args[]){
		ATMHandler handler = Demo.createChain();
		handler.handleRequest(new Request(21000));
	}

}
