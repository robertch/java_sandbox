package app;

public class Runner{
  public Runner(){
    (new Thread(new Watek())).start();
    (new Watek2()).start();
  }
}
