// 주제 : 1에서 10까지 더하기
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Sigma {
  public static void main(String[] args) throws IOException {
    //1) 반복문 사용
    int sum = 0;
    for (int i = 1; i <=10; i++ ) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println("-------------------------");

    sum = computeSigma(10);
    System.out.println(sum);


  }

  static int computeSigma(int value) {
    // 메서드 호출 상황 출력
    for (int i = 0; i < (10 - value); i++) System.out.print(" ");
    System.out.printf("computeSigma(%d)\n", value);

    if (value == 1)
    return value;
    else
    return value + computeSigma(value - 1);
  }
// 계속 Stack에 Frame(메서드 만을 위한 메모리)이 쌓인다.. 

}



/*


*/
