package app;

public class Main{
  public static void main(String[] args) {
    for (int i=1;i<=10 ;i++ ) {
      Calculator calc = new Calculator(i);
      new Thread(calc).start();
    }

  }
}
