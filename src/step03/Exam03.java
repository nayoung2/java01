/* 주제 : 물건(object)과 이름표(reference)의 관계 */

package step03;

public class Exam03{
  public static void main(String[]args){
    // 문자열 리터럴로 String 물건 만들기
    String s1 = "Hello"; //Hello의 주소가 저장됨. ''연산자 - 'A' <=이 자리에 A의 유니코드값이 놓여짐
                                                 //"" 연산자 - Hello라는 문자열을 저장한 char 데이터를 준비하고 그
                                              //주소값을 가져옴 "A" <= A가 만들어지고 이 자리에 그 주소값이 놓여짐
    String s2 = "World";
    String s3 = s1;
    System.out.printf("%s %s %s\n", s1, s2, s3); //

    s1 = s2;
    System.out.printf("%s %s %s\n", s1, s2, s3);
    }
  }

/*
레퍼런스 변수의 진정한 모습
=> 물건을 가리키는 변수
=> 원리 :
  - 모든 물건은 메모리에 존재한다.
  - 따라서 모든 물건은 자신의 고유 주소를 갖고 있다.
  - 레퍼런스란 물건의 주소를 저장하는 변수.
=> primitive type을 제외한 모든 변수는 레퍼런스 변수이다.
    주소를 보관하는 변수이다.
    byte, short, int, long, float, double, boolean, char : 값 저장
    배열과 기타 모든 것 : 주소저장 <---- 레퍼런스 변수라고 부른다

*/
