package headfirst.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
  ArrayList items;
  public DinerMenuIterator(MenuItem[] items){
    this.items=items;
  }
  public Object next(){
    //MenuItem menuItem=Item[position];
    Object object=item.get(position);
    position+=1;
    return menuItem;
  }
  public boolean hasNext(){
    //if(position>=items.length || items[position]=null)
    if(position>=items.size()){
      return false;
    }else{
      return true
    }
  }
}