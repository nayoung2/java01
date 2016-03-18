/* 주제 : 인스턴스 데이터를 다루는 연산자(operator) 추가하기 */

package step09;

public class Exam07 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) { //this 변수가 숨어있다.
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    // 사용자 정의 연산자 추가하기 (static X => 인스턴스 메소드) => 메소드는 데이터타입 관점에서 operator로 볼 수 있당
    void sum() {  // 국, 영, 수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this. math;
    }
    void average() {
      this.aver = this.sum / 3f;
    }


  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);

    // 메서드를 실행하는 것은
    // 인스턴스에 대해 연산자를 실행하는 것과 같다.
    s.summary();//s 데이터에 대해 summary() 연산을 수행한다.
    s.average();//s 데이터에 대한 average() 연산을 수행한다.

    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
}


/* 메서드?
- 특정 기능을 수행하는 명령어를 묶어 둔 것.

- 사용자가 정의한 타입(클래스)의 데이터를 다루는 연산자를 정의할 때
  메서드 문법을 사용한다. => method = operator
- 메서드 실행은 물건에게 명령을 내리기 위해
  메시지를 전달하는 것과 같다. 전달하는 메시지이다. => message
-


int a = 10;

type - 1) 메모리 크기 (4byte)
       2) Data 종류 (정수값)
       3) operators(연산자) ( ex) boolean type에 대해선 전위연산자(++b)나 후위연산자 (b++)등이 정의되어 있지 않다. )

사용자 정의 타입도 마찬가지다. Score의 경우 String 1개 + int 4개 + float 1개 만큼의 메모리 크기를 가지고
Data종류도 정해져있고 (String 1개 + int 4개 + float 1개 )
연산자 역시 사용자 정의 연산자를 추가하여 정의해주는 것 이다.


*/
