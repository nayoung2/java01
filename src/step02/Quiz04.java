/* 퀴즈 : 다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 저장할 데이터
이름,  국어, 영어, 수학
홍길동 100    90    80
임꺽정  90    80    90
유관순  70   100   100


-출력 형식
이름 : 국어, 영어, 수학, 합계, 평균
*/




package step02;

public class Quiz04 {
  public static void main(String[] args) {
    String[] name = new String[3];
    float[] avers = new float[3];
    name[0] = "홍길동";
    name[1] = "임꺽정";
    name[2] = "유관순";
    int[][] scores={
      {100, 90, 80, 0},
      {90, 80, 90, 0},
      {70, 100, 100, 0}
    };

    scores[0][3] = scores[0][0] + scores[0][1] + scores[0][2];
    scores[1][3] = scores[1][0] + scores[1][1] + scores[1][2];
    scores[2][3] = scores[2][0] + scores[2][1] + scores[2][2];

  avers[0] = scores[0][3] / 3;
  avers[1] = scores[1][3] / 3;
  avers[2] = scores[2][3] / 3;

  System.out.printf("%s : %d, %d, %d, %d, %f\n",name[0], scores[0][0], scores[0][1], scores[0][2], scores[0][3], avers[0]);
  System.out.printf("%s : %d, %d, %d, %d, %f\n",name[1], scores[1][0], scores[1][1], scores[1][2], scores[1][3], avers[1]);
  System.out.printf("%s : %d, %d, %d, %d, %f\n",name[2], scores[2][0], scores[2][1], scores[2][2], scores[2][3], avers[2]);


















  }
}
