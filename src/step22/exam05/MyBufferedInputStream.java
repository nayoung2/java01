package step22.exam05;

import java.io.IOException;
import java.io.InputStream;


public class MyBufferedInputStream extends InputStream {
  byte[] buf = new byte[4096]; // 접시 (4K)
  int length;

  InputStream base;

  public MyBufferedInputStream(InputStream base) {
    this.base = base;
  }

  @Override
  public int read() throws IOException {
    if (length <= 0) {
      length = base.read(buf);  // 4096byte를 한꺼번에 읽어옴
                                // 남은 파일의 크기가 4096보다 작을 때 => length의 크기는 항상 4096이 X
                                // 실제 읽어들인 갯수를 length에 넣어줌
      }
    if (length != -1) {
      return buf[--length] & 0x000000ff; // index는 0부터..
                                          //
    } else {
      return length; // 더 이상 읽지 못한 경우 -> read()의 return값 -1 => length도 -1
    }
  }

  public short readShort() throws IOException {
    int result = 0;                                    // 예) 0x00000000
    int temp = this.read();                            // 예) 0x0000002a
    result += (temp << 8);                             // 예) 0x00002a00  ----> result = 0x00002a00

    temp = this.read();                                // 예) 0x0000003b
    result += temp;                                    // 예) 0x00002a3b

    return (short)result; // 앞 2바이트 날린다.        //예) 0000|2a3b
  }

  public int readInt() throws IOException {
    int result = 0;
    int temp = this.read();
    result += (temp << 24);

    temp = this.read();
    result += (temp << 16);

    temp = this.read();
    result += (temp << 8);

    temp = this.read();
    result += temp;

    return result;
  }
}
