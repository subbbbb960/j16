public class GarageDoorOpenCommand implements Command{
  Door door;
  
  public void GrageDoorOpenCommand(Door door){
    this.door=door;
  }
  public void execute(){
    door.up();
  }
}