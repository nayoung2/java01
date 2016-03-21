// 주제 : 디렉토리에 있는 모든 파일(디렉토리 포함) 목록을 알아내기
package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 현재 폴더의 파일과 디렉토리 이름을 모두 출력한다
    String[] files = f.list();
    for(int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
    }
  }
}


/*
H/W 제조사(Vendor) => OS 규격에 따라 H/W 제어 function들을 만든다 -> function들의 모음 = 라이브러리
                                                (ㄴfunction들 = Driver)
                    연결
App <------> File ------- Driver
                  "Mount"

*/
