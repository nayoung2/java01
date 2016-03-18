/* 주제 : 명시적 형변환과 암시적 형변환 함께 사용하기 */

package step04;

public class Exam18 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;
    float c = a / (float)b; //2.5
    System.out.println(c);

    int ch = 44032; //0xac00
    System.out.println(ch); //출력 결과 ---> 10진수 44032 (ch의 type이 졍슈ㅠㅠ)
    System.out.println((char)ch); //출력 결과 ---> 가

    //println은

    }
  }

/*
문자 출력
=> 현재 사용하는 폰트 파일에서 해당 코드의 문자 그림을 찾아서 화면에 출력.
=> 만약 그 폰트에 해당 코드 값에 해당하는 문자가 없다면 출력하지 못한다.
=> Arial 폰트 파일에는 한글이 없다.
    --> Arial 폰트를 사용하여 한글을 출력할 수 없다.
=> 폰트의 종류
  1) Raster(bitmap)
    - 픽셀로 표현
    - 화면 확대할 때 계단 현상 발생
    - 출력 속도가 빠르다
    - 예) 래스터 폰드, .bmp , .gif, .jpeg 등

  2) Vector(truetype)
    - 선 그리기 명령
    - 화면 확대하거나 축소하더라도 깨끗하게 출력
    - 출력할 때 마다 계산해야 하기 때문에 출력속도가 느리다.
    - 예 ) true type 폰트, 클립아트, CAD 이미지 등

*/
