/* 주제 : String 주요 도구 사용법4 */

package step03;

public class Exam10 {
  public static void main(String[]args) {
  String s1 = "ABCDEFGHIJKKMKOP";
  char c = s1.charAt(6);   //charAt는 반드시 물건이 있어야 사용할 수 있는 메서드(non-static)
  System.out.println(c); // 값을 전달 (G의 유니코드 값)(Exam11 설명 보고 넘어오기)

  int i = s1.indexOf('K');  //첫 번째로 만난 문자의 인덱스를 리턴한다.
  System.out.println(i);

  i = s1.lastIndexOf('K');  //뒤에서 부더 찾는다. 처음 만난 문자의 인덱스
  System.out.println(i);

  i = s1.indexOf("HIJ");  // 앞쪽에서 부터 문자열 HIJ를 찾아 문자열의 첫 문자인 H의 인덱스를 리턴
  System.out.println(i);

  i = s1.lastIndexOf("HIJ");  //뒤쪽에서부터 찾아도 문자열의 첫 문자인 H의 인덱스를 리턴
  System.out.println(i);

  String str = s1.substring(6); // 6번부터 끝까지 문자열 추출
  System.out.println(str);

  str = s1.substring(6,10); // 6 <= Index < 10     beginIndex <= < endIndex
  System.out.println(str);

    }
  }

/*

*/
