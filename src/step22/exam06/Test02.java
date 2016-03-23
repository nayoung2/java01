// 주제: 문자 읽기
package step22.exam06;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

public class Test02 {
  static final float ok = 12.375f;
    public static void main(String[] args) throws IOException {
      FileReader in = new FileReader("exam06.Test01.data");

      int c;
      while((c = in.read()) != -1) {  // UTF-8을 읽어서 UTF-16으로 리턴
        System.out.println(Integer.toHexString(c));
      }
      in.close();
      // FileReader는 데이터가 UTF-8(OS 기본 문자 집합) 이라고 간주하고
      // 해당 바이트들을 읽어서 2 byte UTF-16으로 변환하여 리턴한다.
      // (EA B0 80 3byte 읽어서 --> 2byte 리턴  / 41 1byte 읽어서 --> 2byte리턴)
      // => binary 데이터를 FileReader를 사용해서 읽으면 안된다.



      System.out.println("------------------------------");

      FileInputStream in2 = new FileInputStream("exam06.Test01.data");

      while((c = in2.read()) != -1) { // byte를 읽어서 byte로 리턴
        System.out.println(Integer.toHexString(c)); // 4byte => 4번 반복해서 읽음
      }

      in2.close();

    }
  }
