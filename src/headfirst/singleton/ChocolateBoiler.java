package headfirst.singleton;
//레이지 방식
public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null){
      uniqueInstance=new ChocolateBoiler();
    }
    return uniqueInstance();
  }
  public void fill(){
    if(empty){
      empty=false;
      bolied=false;
    }
  }
}