// 주제 : 바이트 읽기 2 => 파일 전체 읽기

package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Test06 {
  public static void main(String[] args) throws IOException{
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    int b;
    while ((b=in.read()) != -1) { // read() - 파일의 끝에 도달 => -1을 리턴
      System.out.println(Integer.toHexString(b));
    }

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
}





/*
'가'의 유니코드 값 -> 0xAc00  ---2진수--> 1010 1100 0000 0000  ---UTF-8---> EAB080
*/
