/*주제 :자바 프로그램 기본 구조 및 컴파일과 실행 */
public class Exam01{
//JVM이 제일 먼저 실행하는 명령어 블록 (main블록)
//만약, 없으면 실행 오류 발생!
// => start entry block(function,method)
//=>문법
//public static void main(String[] 변수명){}
//static public void main(String[] 변수명){}
  public static void main(String[]args){
    System.out.println("Hello,world!");
  }
}

/*컴파일
>javac -d [컴파일된 파일이 놓일 디렉토리 경로] [자바 소스 파일경로]
예1) javac src/Hello.java
      <==자바 소스와 같은 디렉토리에 hello.class가 생긴다
예2)javac -d bin src/Hello.java
      <==Hello.classs파일이 bin 디렉토리에 생성된다
      */
/*실행
>java -cp [클래스 파일이 있는 디렉토리] [클래스 이름]
예1) java Exam01
    <== 1) JRE의 라이브러리($JAVA_HOME/jre/lab/*.jar)를 뒤진다
        2) JRE 확장 라이브러리($JAVA_HOME/jre/lib/ext/*.jar)를 뒤진다  ---이 줄 지워야되는데 안지워짐
        3)현재 작업 디렉토리를 뒤진다
예2) java -classpath bin Exam01
    <==1) JRE의 라이브러리를 뒤진다.
    <==2) -classpath에 설정된 디렉토리를 뒤진다
    <== -classpath 대신 -cp 약자를 사용할 수 있다.
    */
