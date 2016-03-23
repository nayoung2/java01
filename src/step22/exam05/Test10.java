// 주제: 인스턴스 출력하기 - ObjectOutputStream 데코레이터 사용

package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

public class Test10 {
    public static void main(String[] args) throws IOException {
      Member m1 = new Member("홍길동", 20, 180, 70);
      Member m2 = new Member("임꺽정", 45, 178, 98);
      // 실제 작업을 수행할 객체를 준비한다.
      FileOutputStream out0 = new FileOutputStream("exam05.Test08.data");
      BufferedOutputStream out1 = new BufferedOutputStream(out0);
      ObjectOutputStream out = new ObjectOutputStream(out1);

      out.writeObject(m1);
      out.writeObject(m2);

      out.close();
      out1.close();
      out0.close();
    }
  }
//Exception in thread "main" java.io.NotSerializableException: step22.exam05.Member 오류발생 => Test11

/*

Exception in thread "main" java.io.NotSerializableException: step22.exam05.Member 오류
                                            |
                                           |

Member => ObjectOutputStream  -----writeObjet(instance)-------------->     [ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ]
                                        ㄴ바이트 배열로 변환 = "Serialize" = "Marshaling"     |
                                          ----------                                         |
                                            클래스정보, 인스턴스 Data                       |
                                                                                           |
                                                                                          |
                 Member   <---------    ObjectInputStream  <_____________________________|
                        인스턴스 생성                                 바이트배열
                          "Deserialize" = "Unmarshaling"


* Java는 기본이 보안때문에 Serialize를 막는다.
Serialize를 허락하려면, 해당 클래스에 대해 Serialize 할 수 있음을 선언해라.

- 문법
  class Member implements Serializable {  }


*/
