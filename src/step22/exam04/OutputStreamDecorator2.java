package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class OutputStreamDecorator2 extends OutputStream {

  public OutputStreamDecorator2(OutputStream base) throws FileNotFoundException {
    this.base = base;
  }

  @Override
  public int write(int b) throws IOException { // 상속 받은 기능을 쓰는 대신
      // 생성자에게 받은 객체의 기능을 사용한다.
      base.write(b)

  }

  public void writeInt(int value) throws IOException {
    this.write(value>>24);
    this.write(value>>16);
    this.write(value>>8);
    this.write(value);
  }

}
