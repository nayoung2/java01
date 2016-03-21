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
        System.out.println(files[i]); // ./test.txt 경로까지 출력
        System.out.println(files[i].getName()); // test.txt 파일 이름만 출력
      }
    }
  }
}
