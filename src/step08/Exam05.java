/*주제 : 클래스 구동원리 - 인스턴스와 클래스 로딩2 */

package step08;

public class Exam05 {

  public static void main(String[] args) { // stack에 args 메모리
    MyClass.sValue = 20; // NyClass 클래스 로딩 + sValue 로딩
    MyClass obj;  // stack에 obj 메모리
    obj = new MyClass(); // NyClass 클래스 이미 로딩되어있기 때문에 다시 로딩할 필요 X  // new :  MyClass 설계도에 따라 인스턴스 변수를 만들라는 명령(변수선언 - 메모리를 준비하라는 명령어)이 있다면 Heap 영역에 만들어랏
    obj.setIValue(MyClass.sValue); //setIValue 내의 로컬변수들을 Stack에 준비
    obj = new MyClass();
    obj.setIValue(MyClass.sValue);
    System.out.println(obj.iValue);

  }
}

/* 2. 클래스 실행과 메모리 사용

1) [Method Area] Exam02.class를 로딩한다
2) [Method Area] main() 호출한다.
3) [Stack] 메서드가 사용할 로컬 변수를 준비한다
4) [Method Area] main()의 int a = 20; 명령어 실행
   [Stack] a 변수에 20 값을 저장한다.
5) [Method Area] MyClass.class를 로딩한다
6) [Method Area] MyClass의 스태틱 메서드를 실행한다.
7) [Stack] setValue()의 로컬변수 a를 준비한다.
8)  [Stack] main()와 a 값을 setValue()의 a 파라미터에 저장한다.
9) [Method Area] setValue()의 a 값을 MyClass.sValue에 저장한다.
10) [Stack] main으로 돌아간다. --> setValue()가 사용한던 메모리를 해제한다.
11)  [Method Area] main()의 System.out.println(..); 명령을 실행

*/

/* 2. 클래스 실행과 메모리 사용

1) [Method Area] Exam02.class를 로딩한다
2) [Method Area] main() 호출한다.
3) [Stack] 메서드가 사용할 로컬 변수를 준비한다
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
