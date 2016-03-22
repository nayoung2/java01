package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;

public class MyDataOutputStream3 {
  OutputStream out;

  // 생성자의 존재 이유?
  // => 객체를 사용하는데 필요한 최소한의 준비를 시키는 메서드.
  // writeShort, writeInt를 사용하기 위해서는 적어도 out은 설정해주어야 한다.
  // MyDataOutputStream2 에서는 static => out을 설정해주지 않고 사용하면 error뜰 수 있따.
  public MyDataOutputStream3(OutputStream out) {
    this.out = out;
  }

  public void writeShort(short value) throws IOException {
    out.write(value>>8);
    out.write(value);
  }

  public void writeInt(int value) throws IOException {
    out.write(value>>24);
    out.write(value>>16);
    out.write(value>>8);
    out.write(value);
  }

}
