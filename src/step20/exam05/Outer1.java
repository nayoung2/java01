package step20.exam05;

public class Outer1 {
  static int v1;
  static void m1() {}
  int v2;

  void m2() {
    Outer1.this.v1 = 199;
    this.v1 = 200;
    v1 = 201;
  }



  //1) top level inner Class
  static class Inner1{
    static void test() {
      v1 = 10;
      m1();
    }
    void test2() {
      v1 = 10;
      m1();
    }
  }
  //2) member inner class
  class Inner2{

  }
  public void m() {
    //3) local inner class // local변수 static / private 불가능 => local Inner 마찬가지
                          // local inner class가 속한 메서드가 static이냐 아니냐에 따라.
    class Inner3{
      int v1;
      void m(int v1) {
        - v1
        - this.v1 = Inner3.this.v1
        - Outer1.v1
      }

    }

    //4) local annonymous inner Class
    Object obj = new Obhect() {};


  }

  public static void m2() {
    class Inner5 {

    }
  }
  //4) member annonymous inner Class
  Object obj = new Obhect() {};


}
