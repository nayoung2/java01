/*주제 : class로 사용자 정의 타입 만들기  */

package step09;

public class Exam02 {

  static class Score {  //step12 => static을 붙이지 않으면 (=인스턴스 멤버는) main에서 인스턴스 주소가 없으면 접근할 수 없기 때문에 static 붙여줌
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score[] scores = new Score[3]; // 인스턴스 주소를 저장할 레퍼런스 변수 3개.

    scores[0] = new Score(); // 인스턴스 생성 - Score라는 설계도에 따라 Heap에 모든 인스턴스를 만든다.
    scores[0].name = "홍길동";
    scores[0].kor = 100;
    scores[0].eng = 90;
    scores[0].math = 100;

    scores[1] = new Score(); // 인스턴스 생성
    scores[1].name = "임꺽정";
    scores[1].kor = 90;
    scores[1].eng = 90;
    scores[1].math = 80;

    scores[2] = new Score(); // 인스턴스 생성
    scores[2].name = "유관순";
    scores[2].kor = 100;
    scores[2].eng = 100;
    scores[2].math = 100;

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
