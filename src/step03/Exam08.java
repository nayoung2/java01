/* 주제 : String 주요 도구 사용법2  */

package step03;

public class Exam08 {
  public static void main(String[]args) {
    String s1 = "I will take a bus.";
    String s2 = s1.replace('l', 'x'); //String 물건을 생성한다.
    System.out.println(s1); //내용물은 절대 변하지 않는닷. 절대 원본은 바뀌지 않는다
    System.out.println(s2);

    String s3 = s1.replace("bus","taxi"); // 새 String 물건 생성.
    System.out.println(s3);
    System.out.println(s1);



    }
  }
