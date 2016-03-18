/* 주제 : 비트 이동 연산자 */

package step04;

public class Exam07 {
  public static void main(String[] args) {
      // 왼쪽으로 비트를 이동시키기
      int a = 0b0000_1100; //0x0c = 12
      System.out.println(a << 1); // 0001_1000 => 빈 자리는 0으로 채워진다 0001_1000
      System.out.println(a << 2); //0011_00xx => 0011_0000
      System.out.println(a << 3); //0110_0xxx => 0110_0000

      // 왼쪽으로 x비트만큼 이동 ==> 값 * 2^x 배 한 것과 같다.
      // 곱하기를 하는 것 보다 실행속도가 빠르다.

      // 오른쪽으로 비트를 이동시키기
      int b = 0b1100_0000; //0xc0 = 192
      System.out.println(b);
      System.out.println(b >>1);  //x110_0000|0 => 넘어간 비트는 버린다
      System.out.println(b >>2); //xx11_0000|00 => 빈자리는 부호 비트로 채운다
      System.out.println(b >>3); //xxx1_1000|000 => 즉 +는 0, -는 1

      // x비트만큼 오른쪽으로 이동 ==> 값 / 2^x
      // 나눗셈을 수행한 것 보다 더 계산 속도가 빠르다.

      // 음수의 이동 (음수는 맨 첫번째 bit가 무조건 1)
      b = -3;
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b), b);
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>1), b >>1);
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>2), b >>2);
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>3), b >>3);
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>4), b >>4);

      // 오른쪽으로 이동시키는 특별한 연산자 >>>
      // => 빈자리를 무조건 0으로 채운다.
      // => 양수를 오른쪽으로 이동하는 경우 >> 와 결과가 같다.
      // => 그러나 음수의 경우 양수로 바뀐다.
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b), b);
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>>1), b >>>1); //앞자리 0은 출력X
      System.out.printf("%s =====> %d\n", Integer.toBinaryString(b >>>2), b >>>2);

    }
  }

/*






*/
