public class Test {
	public static void main(String args[]){
		Gamer g1=new Gamer();
		Playstation playstation= new Playstation();

		g1.setlevel(" level #1");
		// playstation.add(g1.savetomemento());
		g1.setlevel(" level #2");
		playstation.add(g1.savetomemento());
		g1.setlevel(" level #3");
		playstation.add(g1.savetomemento());
		g1.setlevel(" level #4");
		System.out.println("Your level Now"+ g1.getlevel());
		System.out.println("wanted to resume from first saved level again ?");
		g1.getlevelformemento(playstation.get(0));
		System.out.println("resuming your game from"+ g1.getlevel());

	}
}
