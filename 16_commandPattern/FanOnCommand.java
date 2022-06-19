public class FanOnCommand implements Command{
	
	Fan fan;
	FanOnCommand(Fan fan){
		this.fan=fan;
	}
	public void execute(){
		fan.switchon();
	}
	
}
