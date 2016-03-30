package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener (new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        Point2D.Double p;
        p=toTurtlePos(e.getPoint());
        d=distance(p);
        w=towards(p);
        heading(w);
        forward(d);
        setStatusText("moving to"+p.toString());
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e){
        Point2D.Double p;
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStausText("dragging to"+p.toString());
      }
    });
  }
}
public class TurtleMouseObserverMain{
  public static void main (String[] args){
    TurtleMouseListener t= new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or drag");
  }
}