// 패키지 멤버 클래스를 이용한 상수 다루기
package step20.exam05;

public class Test2 {
  public static void main(String[] args) {
    // 상수 사용하기
    int gender = R.gender.WOMAN; // int gender = 1; 보다 한눈에 보기 좋다.
    int working = R.working.STUDENT;
    int tech = R.tech.JAVA;
  }
}

/*
# top level 중첩 클래스를 이용한 다양한 상수 값의 관리
- 중첩 클래스를 이용하면 여러 개의 .java 파일을 생성하지 않고
  하나의 .java파일에서 일관되게 관리할 수 있다.
- top level 중첩 클래스를 사용하면, 일반 변수처럼 접근할 수 있어서 편리하다.
  (ex ~~.~~~.~~~~)

*/
