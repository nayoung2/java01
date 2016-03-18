/*주제 : 클래스 이름과 파일명 3 */

package step01;

class Exam05X {}
class Exam05Y {}
class Exam05Z {}

  /*한 소스 파일에 여러 개의 클래스 블록을 작성할 수 있다.
  - 컴파일하면 각 클래스 블록마다 그 클래스 이름으로 .class 파일이 생긴다.
  - 소스 코드의 관리를 쉽게 하려면, (각각의)클래스 당 한 개의 소스 파일을 생성하라!

  bitcamp@bitcamp-30119 ~/workspace/java01 $ javac -d bin src/step01/Exam05.java
bitcamp@bitcamp-30119 ~/workspace/java01 $ ls -l bin/step01

-rw-r--r-- 1 bitcamp bitcamp 194  2월 19 16:55 Exam05X.class
-rw-r--r-- 1 bitcamp bitcamp 194  2월 19 16:55 Exam05Y.class
-rw-r--r-- 1 bitcamp bitcamp 194  2월 19 16:55 Exam05Z.class
bitcamp@bitcamp-30119 ~/workspace/java01 $
