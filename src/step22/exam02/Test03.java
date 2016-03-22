// 주제 : 바이트 출력하기 3 - byte배열 전체 출력
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test03 {
  public static void main(String[] args) throws IOException{
    FileOutputStream out = new FileOutputStream("exam02.Test03.data");

    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6f, 0x7a};

    out.write(bytes); // byte배열의 주소를 넘겨준당.

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }
}








/* Java

자바란?
한 번 작성하여 모든 OS에서 실행 가능
 => 이를 위해 JVM을 기반으로 bytecode를 실행
One write

자바를 왜 사용하는가?
다양한 운영체계에서 실행이 가능하기 때문에 컴퓨터 보다는 웹에서 많이 사용

객체지향이란.. -> 큰 프로젝트에서.. 소스코드 유지보수에 용이.

개발자란 -> 컴퓨터라는 도구를 사용해서 업무나 일상에서 도와줄 도구를 만드는 사람

컴파일러란 -> Java의 경우 JVM이 이해할 수 있는 명령어 (bytecode)로 바꿔주는 역할
            CPU가 이해할 수 있는 기계어로 바꾸어주는것도 컴파일러가 하는 일

상속 ->
추상/인터페이스 ->  Generalization 서브 클래스의 공통점을 모아놓고 직접 사용하지는 ㅇ

오버로딩/오버라이딩 ->

Java Script onload/ready

Spring의 장단점

MVC molde1 codel2 비교

포트폴리오에서 아키텍쳐에 대한 설명

*/
