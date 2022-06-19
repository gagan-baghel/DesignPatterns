public class Remote {
	Command command;
	void setcommand(Command command){
		this.command = command;
	}
	void pressbutton(){
		command.execute();
	}
}
