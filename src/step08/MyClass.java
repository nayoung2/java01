/* 스태틱 변수와 인스턴스 변수의 차이  */

package step08;

public class MyClass {
  //필드(field) (참고 - C++ 에서는 member variables 라고 부른다.)
  static int sValue;  //클래스 변수 또는 스태틱 변수 -> 클래스가 로딩되는 순간 자동으로 준비됨
  int iValue; // 인스턴스 변수선언(메모리를 준비하라는 명령어)

  // 메서드(method) (참고 - C++ 에서는 member function이라고 부른다.)
  static void setSValue(int a) {  // 클래스 메서드 또는 스태틱 메서드 => 호출시 this변수 만들어지지 X
    sValue = a;
  }
  void setIValue(int a) { // 인스턴스 메서드 => 호출시 this변수 만들어짐
    iValue = a;
  }
}
