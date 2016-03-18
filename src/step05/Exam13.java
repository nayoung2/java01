/*주제 : 반복문 for와 배열 */

package step05;

public class Exam13 {
  public static void main(String[] args) {
    int[] scores = {100, 60, 70, 0};
    for (int i = 0; i < 3; i++) {  // i <= 2 도 가능하지만 잘 사용하지 않음, i = 0 에서 시작하면 i < 3 의 경우 3번 반복된다는 것을(반복횟수를) 직관적으로 볼 수 있음.
      scores[3] += scores[i];
    }
    System.out.println(scores[3]);
  }
}
