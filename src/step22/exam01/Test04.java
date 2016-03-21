// 주제 : 디렉토리에 있는 파일(디렉토리 제외) 목록을 알아내기
package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test04 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 현재 폴더의 파일 이름을 모두 출력한다
    File[] files = f.listFiles();
    for(int i = 0; i < files.length; i++ ) {
      if (files[i].isFile()) {
        System.out.println(files[i]);
      }
  }
}
}


/*
> touch test02.txt 빈파일 생성

H/W 제조사(Vendor) => OS 규격에 따라 H/W 제어 function들을 만든다 -> function들의 모음 = 라이브러리
                                                  = Driver
                    연결
App <------> File ------- Driver
                  "Mount"

*/
