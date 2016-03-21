// 주제 : 파일 생성, 삭제
package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    File f = new File("./test02.txt");
    // f.createNewFile(); // 그 이름의 파일이 없으면 빈파일 생성(return true), 있으면 생성안함(return false).
    // f.delete(); // 있으면 삭제

    File f2 = new File("./testok.txt");
    // f.renameTo(f2); // 기존 파일의 이름을 변경 (f -> f2)

    // f.mkdir(); // 디렉토리 생성

    if(f.delete()) { // 파일 뿐만 아니라 폴더를 지울 수 있다. -> 삭제한 경우 return true
        System.out.println("삭제 성공!");
    } else {
      System.out.println("삭제 실패!");    // => 폴더 내에 파일이 존재 -> 삭제 실패.
    }

  }
}
/*
> touch test02.txt 빈파일 생성


*/
