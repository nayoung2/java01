// 주제 : 바이트 읽기
package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
java01에 exam02.Test05.data 파일생성
ABC
abc
123
가각간
똘똠똡똣
작성후 저장
*/

public class Test05 {
  public static void main(String[] args) throws IOException{
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    int b = in.read();  // read() - 리턴 타입이 int 이지만 1바이트 값을 읽어서 리턴한다.
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
}
