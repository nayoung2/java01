/*주제 : 클래스 구동원리 - 인스턴스와 클래스 로딩 */

package step08;

public class Exam04 {

  public static void main(String[] args) {
    int a = 20;
    MyClass obj; // 레퍼런스 변수를 선언할 때는 클래스를 로딩하지 않는다. (인스턴스생성/ 클래스 변수 클래스 메서드를 실행할 때 로딩....?)
    obj = new MyClass(); // 클래스 로딩! (인스턴스를 생성하려 할 때) => static변수 자동생성 => 인스턴스 생성(iValue, static이 붙지 않은 변수)
    obj.setIValue(a);
    System.out.println(obj.iValue);

  }
}

/* 인스턴스 생성
- 클래스에 선언된 인스턴스 변수를 Heap 메모리 영역에 준비한다.
********주의*********this**********
*/


/* 2. 클래스 실행과 메모리 사용

1) [Method Area] Exam04.class를 로딩한다
2) [Method Area] main() 호출한다.
3) [Stack] main() 메서드가 사용할 로컬 변수를 준비한다
4) [Method Area] main()의 int a = 20; 명령어 실행
   [Stack] a 변수에 20 값을 저장한다.
5) [Method Area] MyClass.class를 로딩한다
   => sValue 스태틱 변수를 준비한다.
6) //new MyClass -> [Heap] MyClass에 선언된 대로 인스턴스 변수 iValue를 준비한다.
  => 힙에 생성된 인스턴스 주소를 리턴한다.
7) [Stack] MyClass 인스턴스 주소를  obj에 저장한다.
8)  [Stack] MyClass setIValue()의 로컬 변수를 준비한다.
  => a 와 this
  => a 파라미터에는 20을 저장하고 this에는 obj의 값(인스턴스 주소)을 저장한다.
9)  [Method Area] main()의 System.out.println(..); 명령을 실행
10) [Stack] main() 실행 완료 --> main()이 사용한 모든 로컬 메모리 제거.
11) JVM이 종료한다.

*/
