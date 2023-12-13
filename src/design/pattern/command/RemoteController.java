package design.pattern.command;

public class RemoteController {
	
	Command onCommand;
	Command offCommand;
	
	public void setCommand(Command onCommand, Command offCommand){
		this.onCommand = onCommand;
		this.offCommand = offCommand;		
	}
	
	public void onButtonWasPushed(){
		this.onCommand.execute();
	}
	
	public void offButtonWasPushed(){
		this.offCommand.execute();
	}
}
