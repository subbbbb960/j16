package headfirst.template;

public abstract class CaffeineBeverageWithHook{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()==true){
      addCondiments();
    }
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater(){
    System.out.println("Boiling Water..");
  }
  void pourInCup(){
    System.out.println("Pouring into Cup");
  }
  boolean customerWantsCondiments(){
    return true;
  }
}