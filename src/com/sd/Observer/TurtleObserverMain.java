package com.sd.observer;
import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;


public class TurtleObserverMain{
  public static void main(String[] args){
    BabyTurtle baby=new BabyTurtle();
    MomTurtle mom=new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObservers();
  }
}


class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  public void update(Obserable o,Object arg){
    System.out.println("update() called, count is "+((Integer)arg).intvalue());
    babyCurpos((BabyTurtle)o).myCurpos;
    System.out.println("current pos"+babyCurpos);
    moveTo(babyCurpos);
  }
}

class BabyTurtle extends Observable {
  Turtle baby;
  Double myCurpos;
  ArrayList<Observer> obs;
  public BabyTurtel(){
    baby=new Turtle();
    myCurpos=baby.getPos();
    obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o) {
    obs.add(o);
  }
  protected void setChanged(){
    myCourpos=baby.getPos();
  }
  public void notifyObservers() {
    for (Observer o ;obs)
      o.update(this,1)
  }
  public void move(int x,int y) {
    baby.moveTo(x,y)
  }
}