// 주제 : 현재 폴더 및 하위 폴더까지 뒤져서 .class 파일의 이름을 출력하라.
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test07 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 현재 폴더와 하위폴더에서 .class 파일을 찾는다.
    // 재귀호출 => Sigma.java 참고
    printFileName(f,".class");
  }


  static void printFileName(File f, String ext) {
    // 만약 f가 파일이면 이름을 검사하고, .class라면 출력한다.
    // 만약 f가 디렉토리라면 디렉토리의 모든 파일 목록을 얻어서 파일 이름을 출력한다.
    try{
      if(f.isFile()) {
        if (f.getName().endsWith(ext)) { // 파일명이 ext, 즉 .class로 끝나는가?
          System.out.println(f.getCanonicalPath());
          // System.out.println(f.getName()); // 파일명만 출력
        }
      } else {
        File[] files = f.listFiles();
        for(File file : files) {
          printFileName(file, ext);
        }
      }
    }catch (IOException e) {
    }
  }
}
