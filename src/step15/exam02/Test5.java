package step15.exam02;

public class Test5 {
  public static void main(String[] args) {
    Object m1 = new Member(); // OK
    Object m2 = new Student(); // OK

    Member m3 = (Member) m1;
    Member m4 = (Member) m2;

    Member m5 = (Student) m1; // 컴파일 OK, 실행 Error
    Member m6 = (Student) m2; // 컴파일 OK, 실행 OK

  }
}
