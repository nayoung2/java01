package test01;

public class Calculator3 {

   int result;

    static void plus(Calculator3 that, int b) {
      that.result += b;
    }

    static void minus(Calculator3 that, int b) {
      that.result -= b;
    }

    static void multiple(Calculator3 that, int b) {
      that.result *= b;
    }

    static void divide(Calculator3 that, int b) {
      that.result /= b;
    }
  }
