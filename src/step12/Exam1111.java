/* 주제: final 활용 */
package step12;

public class Exam11 {
  // 컴파일 오류! 상속 불가!
  class Car2 extends Car8 {}

    class MyString extends String { // =>String 클래스는 final. 암호는 대부분 문자열 비교이기 때문에 상속받지 못하도록 만들어둠.
      @Override
      public String eqauls(Object obj) {
        return true;
      }
    }
  public static void main(String[] args) {
    MyString s1 = "aaa";
    MyString s2 = "bbb";
    if (compare(s1, s2)) {
      System.out.println("OK");
    } else {
      System.out.println("NO");
    }
  }

static boolean compare(String s1, String s2) {
  if (s1.equals(s2)) return true;
  else return false;
}
}

/*
# 클래스 앞에 final을 붙이는 경우 = 보안
- 상속을 막고 싶을 때.
- 왜?
  => 다형적 변수의 특성에 따르면 상위 클래스를 요구하는 자리에
    하위 클래스를 대입할 수 있다. (Car8을 요구하는 자리에 Car2 대입)
  => 보안이 필요한 업무에서는 특정 클래스가 다른 클래스로
    대체되는 것을 방지해야한다. (기존 클래스를 상속받은 조작된 클래스가 대체되는것을 방지)
  => 그런 경우에 final을 사용하여 하위 클래스를 만들지 못하도록 한다.
  => 하위 클래스를 만들 수 없다면 기존 클래스를 대체할 수 없다.









boolean m (String s1, String s2) {
  if(s1.equals(s2)) {
  return true;
} else {
  return false;
}
}




String
  MySting - equals()  => retrun true;



*/
