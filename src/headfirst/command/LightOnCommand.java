package headfirst.command;

public class LightOnCommand implements Command {
  Light light;
  
  public void LightOnCommand(Light light){
    this.light=light;
  }
  
  public void execute(){
    light.on();
  }
}