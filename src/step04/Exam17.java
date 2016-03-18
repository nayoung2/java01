/* 주제 : 암시적 형변환의 규칙 */

package step04;

public class Exam17 {
  public static void main(String[] args) {
    byte b = 10;
    short s = 20;
    int i = 30;
    long l = 40;
    float f = 3.14f; //암시적 형변환 수행
    double d = 345.5;

    double result = b + s + f - i - d + l;
    /*
    1) b(int) +s(int) + f - i - d + l;
    2) int + f - i - d + l;
    3) (float) + f - i - d + l;
    4) float - i - d + l;
    5) float - (float) - d + l;
    6) float - d + l;
    7) (double) - d + l
    8) double + l
    9) double + (double)
    10) double
    */
    System.out.println(f);

    // 연산자 우선순위와 암시적 형변환
    int v1 = 5;
    int v2 = 2;
    float v3 = 5;
    float v4 = v3 + v1 / v2; //7.0
    //float v4 = v3 + (float)v1 /(float) v2; //7.5
    System.out.println(v4);



    }
  }

/*
암시적 형변환 규칙
=> 다음과 같이 힘쎈 타입으로 형변환된다. // 주의 ! 한번 선언된 변수의 타입은 바뀔 수 없다. 알맞은 사이즈의 새로운 메모리를 만들어 값을 복사해오는것 뿐..
(byte, short, int < long < float < double)
=> 주의!
   byte와 short는 연산할 때 무조건 int로 형변환 된다.
=> byte, short ---> int
=> int, long ---->float, double
=>float ----> double

*/
