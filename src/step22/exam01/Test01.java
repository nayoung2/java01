// 주제 : 파일 정보 다루기
package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) throws IOException {
    File f = new File("."); // . : 현재경로
    File f2 = new File("../project01/src/bitcamp/pms/ProjectApp.java");

    System.out.printf("getName() : %s\n", f.getName());
    System.out.printf("getPath() : %s\n", f.getPath());
    System.out.printf("getAbsolutePath() : %s\n", f.getAbsolutePath());
    // . 또는 ..에 대해 계산을 완료한 경로
    // . => 현재 폴더
    // .. => 상위 폴더
    System.out.printf("getCanonicalPath() : %s\n", f.getCanonicalPath()); // IOException 예외 발생

    System.out.println("-----------------------------------------");

    // 경로에서 파일명만 추출
    System.out.printf("getName() : %s\n", f2.getName());

    // 경로에서 사용자가 지정한 경로를 모두 출력 (../project01/src/bitcamp/pms/ProjectApp.java)
    System.out.printf("getPath() : %s\n", f2.getPath());

    // 전체 경로를 출력한다.
    // 단 경로에서 . 또는 ..에 대해 그대로 유지한다.
    System.out.printf("getAbsolutePath() : %s\n", f2.getAbsolutePath());

    // . 또는 ..에 대해 계산을 완료한 경로
    // . => 현재 폴더
    // .. => 상위 폴더
    System.out.printf("getCanonicalPath() : %s\n", f2.getCanonicalPath()); // IOException 예외 발생

    // 파일인 경우 폴더를 가리킨다.
    System.out.printf("getParent() : %s\n", f2.getParent());

    // 파일의 크기 (Byte)
    System.out.printf("length() : %s\n", f2.length());

    // URI 정보 추출
    System.out.printf("toURI() : %s\n", f2.toURI());

    // 파일 및 디렉토리 여부 검사
    System.out.printf("isFile() : %s\n", f2.isFile()); // 이 경로가 파일을 가리키는지?
    System.out.printf("isDirectory() : %s\n", f2.isDirectory()); // 디렉토리를 가리키는지?

    // 파일 또는 디렉토리의 존재 여부 검사
    System.out.printf("exists() : %s\n", f2.exists());

    // (경로가 소속되어있는)파티션의 크기 알아내기
    System.out.printf("getTotalSpace()  : %s\n", f2.getTotalSpace());  // 총 공간
    System.out.printf("getFreeSpace()   : %s\n", f2.getFreeSpace()); // 자유로운 공간
    System.out.printf("getUsableSpace() : %s\n", f2.getUsableSpace()); // 자유공간 중 이용할 수 있는 공간

    // 파일 작성일 또는 마지막으로 변경한 날짜
    long millis = f.lastModified(); // lastModified() - ms단위
    java.sql.Date date = new java.sql.Date(millis); // yyyy-mm-dd
    System.out.printf("lastModified() : %s\n", date.toString());


  }
}
/*
# 파일의 위치 정보 표현
1) path // 생성자 File(String pathname) 사용
  - OS의 파일시스템의 경로 정보이다.
  - 예) 윈도 => c:\Program Files\Java\jdk1.8.0_74
  - 예) 리눅스 => /usr/local/jdk1.8.0_74 (항상 root(/)밑에)

2) URI(uniform Resource Indicator)  // 생성자 File(URI uri) 사용
  - 웹 주소 형태로 표현하는 경로 정보이다.
  - 예) 윈도 => file://c:/Program+Files/Java/jdk1.8.0_74 (중간의 공백은 +로 표시)
  - 예) 리눅스 => file:///usr/local/jdk1.8.0_74
                        -- root (/)

# URI, URL, URN
- URI(uniform resource Indicator)
  => 네트워크 상에 있는 자원의 주소를 표현하는 방법
  => 표현방법
    1) URL(uniform Resource Locator) // 단일화된(유일한) 자원 위치
      프로토콜://서버주소:포트번호/.../자원경로
      예) http://www.bitcamp.co.kr/board/index.html
    2) URN(uniform Resource Name)
      예) urn:ISSN:0167-6423

*/
