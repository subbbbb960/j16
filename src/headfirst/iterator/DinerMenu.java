package headfirst.iterator;

public class DinerMenu implements Menu{
  static final int Max_Items=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems=new MenuItem[Max_Items];
    addItem("채식주의자 샌드위치","고기 없어요! 채소만 가득 ",true,2.9);
    addItem("치즈샌드위치","모짜렐라 & 체다 치즈 흘러넘쳐요! ",false,2.9);
    addItem("에그샌드위치","반숙 계란이 넘쳐요! ",false,2.9);
  }
  
  public void addItem(String name,String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name,description,v,p);
    if (numberOfItems>=Max_Items){
      System.out.println("더이상 메뉴를 추가할 수 없네요 ㅜㅜ ");
    } else{
      menuItem[0]=menuItem;
      numberOfItems+=1
    }
  }
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}