/* 주제 : 또 다른 인스턴스 초기화 문법 - 인스턴스 초기화 블록
*/
package step09;

public class Exam05 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    { // 인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록1");
    }

    Score(String name, int kor, int eng, int math) { //this 변수가 숨어있다.
      System.out.println("생성자 호출.");
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    { // 인스턴스 초기화 블록
        System.out.println("인스턴스 초기화 블록 2"); // 초기화 블록의 위치 상관X, 여러개도 가능
    }
    }

  public static void main(String[] args) {

      new Score("홍길동", 100, 100, 100); // 초기화블록1 => 초기화블록2 => 생성자 호출

      //참고! 익명 클래스 만들기
      Object annoymousObj = new Object() {
        public String toString() {
          return "오호라 익명 객체";
        }
        {
          System.out.println("오호라... 익명 객체 초기화!");
        }
      };
      System.out.println(annoymousObj);
    }
}

/*출력 결과
인스턴스 초기화 블록1
인스턴스 초기화 블록 2
생성자 호출.
오호라... 익명 객체 초기화!
오호라 익명 객체
*/

/* 인스턴스 초기화 블록
- 생성자처럼 인스턴스가 생상될 때 마다 실행되는 블록
  => 인스턴스 초기화 블록이 모두 실행된 후 생성자가 실행된다.
- 생성자가 있는데 왜 이 문법이 필요한가?
  언제 사용하는가?
  생성자가 없는 클래스에 대해 초기화 작업을 추가하고 싶을 때.
- 생성자가 없는 클래스?
  => 익명 중첩 클래스! //생성자 메소드 이름은 클래스의 이름은 그대로 가져오는데, 클래스의 이름이 없는 경우 생성자가 만들어 질 수 없다??


...인스턴스 초기화 블록은 일반적으로 잘 쓰지 않는당....

























*/
