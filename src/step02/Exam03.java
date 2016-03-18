/*주제 : 정수 변수의 사용 */

package step02;

public class Exam03{
  public static void main(String[]args){
    byte b1 = 10;       // 1byte 메모리에 4byte 정수값을 저장 ? (Literal은 다 4byte)
    short s1 = 20;      // 2byte 메모리에 4byte 정수값을 저장 ?
    int i1 = 30;        // 4byte 메모리에 4byte 정수값을 저장 : OK!
    long l1 = 40;       // 8byte 메모리에 4byte 정수값을 저장 : OK!

    //byte b2 = 128;      // 1byte 메모리 : -128 ~ 127 : 오류! 저장오류 (메모리에 값을 저장하는데에 오류)
    //short s2 = 32768;   // 2byte 메모리 : -32768 ~ 32767 : 오류 ! possible lossy conversion from int to short 저장오류
    //int i2 = 2147483648; // integer number too large 저장(할당) 오류가 아닌 Literal 표현의 오류.
    //int i2 = 2147483648L; //possible lossy conversion from long to int : 저장오류
    //long l2 = 2147483648; //Literal 표기 오류. 4byte를 넘어가면 뒤에 꼭 L을 붙여줘야한다.
    long l2 = 2147483648L; //OK!


  }
}

/*
 작은 크기의 메모리에 큰 값(4바이트 정수 값)저장?
 - byte, short 메모리에 4byte 정수 값을 저장할 때,
  메모리에 저장할 수 있는 값이라면 허락한다. (8byte 값은 해당 안됨)
    ex ) int i2 = 10L; //8byte지만 10을 int에 담을 수 있는데 오류
  메모리에 저장할 수 없는 크기의 값이라면 컴파일 오류가 발생한다.


  실무 조언?
  - 실무에서는 작은 값을 저장하더라도 기본으로 int 메모리를 사용한다.
(나이는 보통 150이하의 값)
 하지만, byte age = 10; 대신
 int age = 10; 를 사용한다.

 1바이트나 2바이트를 저장할 때 왜 4바이트 int 메모리를 사용하는가?
- 32비트 JDK의 경우, 한 번에 32비트(4바이트) 단위로 값을 다룬다.
  => 1바이트를 다룰 때도 4바이트 통로를 사용하고,
     2바이트를 다룰 때도 4바이트 데이터 버스를 사용한다.

      */
