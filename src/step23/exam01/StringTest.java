package step23.exam01;

public class StringTest {
  public static void main(String[] args) {
    String s1 =  new String("Hello");
    String s2 = "Hello"; // new String("Hello"); // 상수풀에 저장
    String s3 =  new String("Hello");
    String s4 = "Hello"; // new String("Hello");  // 기존에 있는 인스턴스 주소를 저장

    if(s1==s3) System.out.println("s1 == s3");
    if(s2==s4) System.out.println("s2 == s4");
  }

}
