package test01;

public class Calculator4 {

   int result;

    void plus(int b) {  //static을 떼어내는 순간 이 메서드는 인스턴스 메서드가 되고, 자동으로 주소값 this변수를 받는당!
      this.result += b;
    }

    void minus(int b) {
      this.result -= b;
    }

    void multiple(int b) {
      this.result *= b;
    }

    void divide(int b) {
      this.result /= b;
    }
  }
