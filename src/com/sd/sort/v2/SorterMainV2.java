/*
 * This is java programming homework.
 * 
 */

package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class SorterMainV2 {
    public static void main(String[] args) {
        Date d1=new Date(1996,5,25);
        Date d2=new Date(1995,11,6);
        Date [] d1d2 = {d1 , d2};
        Comparator dateComp=new DateComparator();
        Sorter.sort(d1d2, dateComp);
        
        for(int i=0; i<d1d2.length; i++)
            System.out.println("DateArray["+i+"]="+d1d2[i]);
        /*
         * date 실행하면 결과값이
         * DateArray[i] = 요일 월 날짜 시간
         * 이런식으로 결과값이나옴 수진이언니생일 1995.11.6월이 내생일 1996.5.25보다
         * 먼저 정렬되어있음
         */

        WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);
        
        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
        /*
         * 터틀실행잘됨 
         */
        
        String[] B={"KangSuBin" , "LeeSuJin" , "OhEunJu" , "BaekDoHyun"};
        Comparator stringComp=new StringComparator();
        Sorter.sort(B, stringComp);
        
        String [] sArray = {"KangSuBin" , "LeeSuJin" , "OhEunJu" , "BaekDoHyun"};
        Comparator reverseComp = new ReverseComparator(stringComp);
        Sorter.sort(sArray,reverseComp);
        
        for (int i=0;i<sArray.length; i++)
          System.out.println("ReverseArray["+i+"]="+sArray[i]);
        
    }
}

class Sorter {
  public Sorter() {}
    public static void sort(Object[] data, Comparator comp) {
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}


interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}



class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}

class ReverseComparator implements Comparator {
    private final Comparator c;
    public ReverseComparator(Comparator c) {this.c = c; }
    public int compare(Object o1, Object o2) {
        return c.compare(o2, o1);
    }
}


class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}