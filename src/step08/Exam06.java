/*주제 : 클래스 구동원리 - 가비지와 가비지 컬렉터 */

package step08;

public class Exam06 {

  public static void main(String[] args) { // stack에 args 메모리
    MyClass obj1;
    MyClass obj2;
    MyClass obj3;

    obj1 = new MyClass(); //인스턴스 생성
    obj2 = new MyClass(); //인스턴스 생성
    obj3 = obj1;
    obj3.iValue = 100;
    obj3 = obj2;
    obj3.iValue = 200;
    obj1 = obj3; // 처음 생성했던 인스턴스의 주소를 잃어 버림.
                // => 가비지 (garbage)라 한다.
   System.out.printf("%d, %d, %d\n", obj1.iValue, obj2.iValue, obj3.iValue )
  }
}



/* 가비지 (garbage)?
- 주소를 갖고 있는 레퍼런스가 없는 인스턴스이다 -> 주소를 잃어버린 인스턴스
- 주소를 잃어버렸기 때문에 사용할 수 없다.
- 프로그래밍 일반 용어로 "dangling object"라 부른다.
- JNM의 가비지 수집기에 의해 메모리가 자동 해제 된다.
*/

/* 가비지 컬렉터 (garbage collector)?
- Heap에 잔존하는 가비지들을 찾아 해제한다.
- 언제 작업하는가?
1) JVM이 관리하는 메모리가 부족할 때
  => 일반적인 상황에서 작동한다.
2) CPU가 한가할 때 (idle time) // 일반적으로는 사용되지 않는다.  // 우리는 garbage collector는 강제로 실행시키지 않도록 한다!!
  => 24시간 365일 계속해서 실행하는 경우에나 이런 조건으로 작동할 것이다.(naver 시스템 운영팀 같은 경우에나 사용..)

  ==>가비지들을 모두 관리 한 후에도 메모리가 부족한 경우엔 OS에게 메모리를 더 할당받는다...
