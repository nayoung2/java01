// 주제: 문자 출력하기
package step22.exam06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test01 {
  static final float ok = 12.375f;
    public static void main(String[] args) throws IOException {
      FileWriter out = new FileWriter("exam06.Test01.data");

      char c1 = '가'; // 0xAc00(UTF-16 in JVM) --파일로 출력--> 0xEAB080(UTF-8 in OS) // 운영체제의 defalt값에 따라 출력이 달라진다.
                                                                                      // 만약 windows에서 실행했다면 MS949로 변환됐을 것..
      // 1010_1100_0000_0000 (UTF-16)
      // 1110_xxxx_10xx_xxxx_10xx_xxxx (UTF-8 변환형식)
      // 1110_1010_1011_0000_1000_0000 (UTF-8)
      // EA_B0_80

      char c2 = 'A'; //0x0041(UTF-16 in JVM) --> 0x41(UTF-8 in OS)

      out.write(c1);  // UTF-16 (char) --> UTF-8 변환하여 출력한다. // FileWriter의 write()는 데이터가 유니코드 UTF-16이라 가정한 후 UTF-8로
                                                                    // 변환하여 출력
                                                                    // 그림파일이나 byte 배열은 FileWriter 사용하면 X
      out.write(c2);  // UTF-16 --> UTF-8 변환하여 출력한다.

      out.close();

      FileOutputStream out2 = new FileOutputStream("exam06.Test01.data2");
      out2.write(c1); // 맨 끝 1바이트 출력 --> 00 // FileOutputStream의 write는 맨 끝 1바이트 출력
      out2.write(c2); // 맨 킅 1바이트 출력 --> 41
      out2.close();


    }
  }


/*
File - 1) binary File: FileOutputStream 사용
       2) text File: FileWriter 사용
          ----
            메모장으로 편집할 수 있으면 text파일. (아래한글파일이나 pdf도 text파일 아님.)

*/















/*
// 10진수의 소수를 2진수로 변환 => 정확도 떨어짐 byte 클수록 정확도가 더 높다..


   12.375
  --- ----
1100 . 011
   | normalize 정규화
= 1.100011 x 2^3

소수점 아래 자리 2진수로 바꾸기
0.375
  x 2
------
0.750 ===> 몫 0
x  2
-----                     => 0.011
1.500 ===> 1
0.500
x  2
-----
1.00 ====>1
0.00


0.375는 이렇게 딱 떨어졌지만 소수점중 무한반복되는 경우가 있다. 그런 경우
ex) 0.374 =>0.3739999999.... 처럼 뒤에 쭉 9를 써줘서 그 값에 가깝게 하는 수밖에 없음.
하지만 그 값은 원래 값보다 작은 수 ===> 10진수의 소수를 2진수로 변환하면 정확도가 떨어진다.
type의 크기(byte) 클수록 정확도가 더 높다..(float < double (?))
작은 byte => 0.3799
큰 byte => 0.3699999999

*/
