public class SimpleRemoteControl {
  Command command;
  
  public setCommand(Command command){
    this.command=command
  }
  public buttonPressed(){
    command.execute();
  }
}