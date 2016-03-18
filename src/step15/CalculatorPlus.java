package step15;

public class CalculatorPlus extends Calculator {
  protected int
  public void multiple(int value) {
    this.result *= value;
  }
  public void divide(int value) {
    this.result /= value;
  }
  public void remainder(int value) {
    this.result %= value;
  }

}
