package headfirst.template;
import java.util.Scanner;


public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Brew Coffe Grind");
  }
  
  public void addCondiments(){
    System.out.println("Add Sugar And Milk");
  }
  
  public boolean customerWantsCondiments(){
    String answer;
    Scanner a=new Scanner(System.in);
    System.out.println("Add Condiments? (yes/no)");
    answer=a.nextLine();
    
    if(answer=="yes")
      return true;
    else
      return false;
  }
}