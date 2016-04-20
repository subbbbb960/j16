package headfirst.singleton;
import headfirst.singleton.ChocolateBoiler;

public class ChocolateMain{
  public static main (String[] args){
    ChocolateBoiler boiler=ChocolateBoiler.getInstance();
    boiler.fill();
    ChocolateBoiler boiler2=ChocolateBoiler.getInstance();
  }
}