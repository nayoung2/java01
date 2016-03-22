package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class MyDataOutputStream4 extends FileOutputStream {

  public MyDataOutputStream4(String name) throws FileNotFoundException {
    super(name); //FileOutputStream의 생성자 중 문자열을 받는 생성자 호출
                // 안쓰면 기본생성자 호출 => FileOutputStream는 기본생성자 존재X =>  오류
  }

  public void writeShort(short value) throws IOException {
    this.write(value>>8);
    this.write(value);
  }

  public void writeInt(int value) throws IOException {
    this.write(value>>24);
    this.write(value>>16);
    this.write(value>>8);
    this.write(value);
  }

}
