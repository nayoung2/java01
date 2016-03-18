/* 주제 : 파라미터를 갖는 생성자
 * 인스턴스를 생성할 때 외부에서 주입한 값으로 초기화시키기.
*/
package step09;

public class Exam04 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    // 주의 ) 생성자가 단 한개라도 있으면 기본 생성자는 자동으로 붙지 않는다.
    Score(String name, int kor, int eng, int math) { //this 변수가 숨어있다.
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.kor = kor;
      this.eng = eng;
      this.math = math;

    }
  }

  public static void main(String[] args) {
    // new Score(); => 오류 ! 기본 생성자가 없기 때문에..
    // error: constructor Score in class Score cannot be applied to given types;
    // new Score();
    //   ^
    // required: String,int,int,int
    // found: no arguments
    // reason: actual and formal argument lists differ in length

    // System.out.println("--------------------------------");
    Score[] scores = new Score[]{
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80),
    }; //Exam02와 비교..
    for (int i = 0; i < scores.length; i++) {
      scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
      scores[i].aver = scores[i].sum / 3f; //암시적 형변환 이용
    }

    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
    }
}
}
