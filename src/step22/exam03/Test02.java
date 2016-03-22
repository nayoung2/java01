// 주제 : 메모리(바이트 배열)에 있는 바이트 값을 스트림 API를 사용해서 읽기
package step22.exam03;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.IOException;


public class Test02 {
  public static void main(String[] args) throws IOException{
    byte[] bytes = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};

    ByteArrayInputStream in = new ByteArrayInputStream(bytes);

    for (int i = 0; i < 10; i++) {
      System.out.println(in.read()); // read()의 return값 10진수..
                                     // 배열에서 데이터를 읽어들이지만 (대상 : 배열) 파일을 읽을때(대상이 파일일 때)와 똑같이!
    }


    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();


  }
}
//개하기싫다....................................쁘야아아아아아아
