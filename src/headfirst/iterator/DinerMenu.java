package headfirst.iterator;

public class DinerMenu implements Menu{
  static final int Max_Items=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems=new MenuItem[Max_Items];
    addItem("ä�������� ������ġ","��� �����! ä�Ҹ� ���� ",true,2.9);
    addItem("ġ�������ġ","��¥���� & ü�� ġ�� �귯���Ŀ�! ",false,2.9);
    addItem("���׻�����ġ","�ݼ� ����� ���Ŀ�! ",false,2.9);
  }
  
  public void addItem(String name,String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name,description,v,p);
    if (numberOfItems>=Max_Items){
      System.out.println("���̻� �޴��� �߰��� �� ���׿� �̤� ");
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