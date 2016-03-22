// 주제 : 바이트 읽기 3

package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Test07 {
  public static void main(String[] args) throws IOException{
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100];
    int len = in.read(buf); // 읽은 데이터를 버퍼에 넣는다. 리턴 값은 읽은 개수이다.

    for(int i = 0; i < len; i++) { // 읽은 개수만큼 반복문.
    System.out.println(Integer.toHexString(buf[i]));
    }
    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
}

// ea(1byte)(0110 1010) ---Integer.toHexString()----> 1111 1111 1111 1111 0110 1010(4byte, 빈 bit를 부호bit로 채움) => ffffea




/*
'가'의 유니코드 값 -> 0xAc00  ---2진수--> 1010 1100 0000 0000  ---UTF-8---> EAB080
*/
