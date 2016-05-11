package headfirst.facade;

public class Tuner{
  Amplifier amplifier;
  Double frequency;
  
  public Tuner(String tuner , Amplifier amplifier){}
  public void on(){ System.out.println("tuner on"); }
  public void off(){ System.out.println("tuner off"); }
  public void setFrequency(double frequency){ System.out.println("freq is"+frequency); }
}