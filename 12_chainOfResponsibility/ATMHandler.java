

abstract class ATMHandler {
	ATMHandler nextHandler;
	int level;
	void setnextHandler(ATMHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	public void handleRequest(Request r) {
		if ((r.amount % 100) == 0) {
			if (level <= r.amount) {
				calculate(r.amount, level);
				if(level % 100){
					System.out.println("cant witderaw"+  r.amount%100);
				}
			} else if (nextHandler != null) {
				nextHandler.handleRequest(r);
			}
		}
		else {
			System.out.println("not multiple of 100");
		}
	}

	public void calculate(int amount, int level) {
		int no = amount / level;
		int amnt = amount % level;
		System.out.println(level + "rs note " + no);
		if (amnt != 0)
			this.handleRequest(new Request(amnt));

	}
}
