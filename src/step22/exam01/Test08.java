// 주제 : 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력하라.
// > java -cp bin step22.exam01.Test08 ./bin ../Project01/bin
// 출력 결과:
//   /home/bitcamp/workspace/java01/bin/step09/Exam08$Score.class
//   /home/bitcamp/workspace/java01/bin/step09/Exam03$Score.class
//   /home/bitcamp/workspace/java01/bin/step09/Exam06$Score.class
//   /home/bitcamp/workspace/java01/bin/step09/Exam02$Score.class
//                        ...
// step13.Exam07 참고
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test08 {
  public static void main(String[] args){
      File f = null;   // 반복문 내에 선언하는 것은 피하자.
      for (String path : args) {
        f = new File(path);
        printFileName(f,".class");
      }
  }

  static void printFileName(File f, String ext) {
    // 만약 f가 파일이면 이름을 검사하고, .class라면 출력한다.
    // 만약 f가 디렉토리라면 디렉토리의 모든 파일 목록을 얻어서 파일 이름을 출력한다.
    // try{
      if(f.isFile()) {
        if (f.getName().endsWith(ext) && f.getName().contains("$") /*f.getName().indexOf('$') >= 0*/) {
          // System.out.println(f.getCanonicalPath());
          System.out.println(f.getName());
        }
      } else if(f.isDirectory()){
        for(File file : f.listFiles()) {
          printFileName(file, ext);
        }
      }
    // }catch (IOException e) {
    // }
  }
}







/*

grep -r '~~~'   ~~~가 포함된 파일 찾기

*/
