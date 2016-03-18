/*퀴즈 : 다음 값을 저장할 수 있는 변수를 선언하시오!
- 국어, 영어, 수학 점수와 총점, 평균, 재직여부, 성별 값을 저장
*/

package step02;

public class Quiz01{
  public static void main(String[] args){
    int kor = 80;
    int eng = 90;
    int math = 100;
    int sum = kor + eng + math;
    float average = sum / 3;
    boolean working = false;
    char gender = 'W';
  //  System.out.printf("%d, %d, %d, %d, %f, %b, %c\n", kor, eng, math, sum, average, working, gender);


  }
}
