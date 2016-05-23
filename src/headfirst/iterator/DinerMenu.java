public class DinerMenu{
  static final int Max_Items=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems=new MenuItem[Max_Items];
    addItem("Vegetarian BLT","no meat,only vegetable",true,2.9);
    addItem("Cheese BLT","mozzarella & cheddar cheese overflow",false,2.9);
    addItem("Egg BLT","half bolied egg overflow",false,2.9);
  }
  public void addItem(String name,String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name,description,v,p);
    if (numberOfItems>=Max_Items){
      System.out.println("Error, can't add item");
    } else{
      menuItem[0]=menuItem;
      numberOfItems+=1
    }
  }
}