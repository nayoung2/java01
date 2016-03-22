// 주제 : 바이트 출력하기
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test01 {
  public static void main(String[] args) throws IOException{
    FileOutputStream out = new FileOutputStream("exam02.Test01.data");

    int value = 0x2a3b4c5d; // 708529245(10진수) // int - 4byte

    out.write(value); // 비록 파라미터 타입이 int라 하더라도 맨 끝 1바이트만 출력. (5d)

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }
}


// exam02.Test01.data이 생기면 ctrl + shift + P => Hex 검색후 실행




/*
Java - int, long, float, double 네 가지 type에 대해서만 연산을 제공
      => JVM 연산의 기본단위는 int
*/

/*
Streaming => ~~ Data 입/출력을 위해 만든 API -> H/W에 상관 없이 모두 I/O의 대상으로 본다
                                                (USB든, 오디오장치든, 그래픽장치든...)
  _____
 |I/O |  +   File - 파일입출력
|API |   +   Socket - 네트워크통신
-----    +   Pipe

*/

/*
# 자바 입출력
- Data streaming 개념을 지원한다.
  즉, 대상이 누구냐에 상관 없이 단순히 데이터 입출력 흐름으로 보는 것.
- 특징
1) 입력과 출력 역할을 분리하였다.
2) 바이트 스트림과 문자 스트림으로 구분하였다.
3) 데이터를 목적지에 직접 읽고 쓰는 클래스와 중간에서 데이터를 처리하는 클래스로
  구분하였다.
- 주요 클래스
1) InputStream/OutputStream : 바이트 스트림을 다루는 추상 클래스. (직접 사용하지 X, 서브클래스에게 메서드 등을 상속해 주기 위한 목적의 클래스)
(하위클래스) => Data Sink Stream Class (직접 읽고 쓰기)
                   FileInPutStream/FileOutputStream --> I/O 대상이 파일이다.
                   ByteArrayInputStream/ByteArrayOutputStream --> I/O 대상이 바이트 배열.
                   PipedInputStream/PipedOutputStream --> I/O 대상이 프로세스(다른 프로그램)
             => Data Processing Stream Class (중간에 데이터 가공)
                   BufferedInputStream/BufferedOutputStream --> 버퍼를 이용한 입출력 속도 개선
                   DataInputStream/DataOutputStream --> 원시타입 등의 데이터를 입출력하기 쉽다.
                   ObjectInputStream/ObjectOutputStream --> 인스턴스 입출력.
                   나머지 모두... (Data Sink Stream Class 제외하고 모두 Data Processing Stream Class (?))
                   PrintStream --> 바이트 및 문자 출력 가능!
2) Reader/Writer : 문자 스트림을 다루는 추상 클래스.
(하위클래스) => Data Sink Stream Class (직접 읽고 쓰기)
                   FileReader/FileWriter --> I/O 대상이 파일
                   CharArrayReader/CharArrayWriter --> I/O 대상이 char 배열
                   StringReader/StringWriter --> I/O 대상이 문자열
                   PipedReader.PipedWriter --> I/O 대상이 프로세스
             => Data Processing Stream Class (중간에 데이터 가공)
                   BufferedReader/BufferedWriter  --> 버퍼를 이용한 입출력 속도 개선
                   PrintWriter --> 바이트 및 문자 출력가능!

PrintWriter --> 출력
*/
