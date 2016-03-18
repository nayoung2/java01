/*주제 : 클래스 이름과 파일명 2 */

package step01;

class Exam04X{

  public static void main(String[]args){
    System.out.println("Hello,world!");
  }
}


/*  비공개 클래스는 소스 파일명이 클래스 이름과 다르더라도 괜찮다.
*/

/* 중요!!!!!!!
 - 클래스 파일 이름은 자바 소스 코드에서 지정한 클래스 이름을 사용한다.
 - 자바 소스 파일명은 사용하지 않는다!
 - 자바 소스 파일명과 클래스명은 상관없다.

 bitcamp@bitcamp-30119 ~/workspace/java01 $ ls -l bin/step01
-rw-r--r-- 1 bitcamp bitcamp 426  2월 19 16:50 Exam04X.class
