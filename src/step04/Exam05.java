/* 주제 : 비트 연산자 사용 */ //이미지에 필터(마스크)를 씌우는데 쓸 수 있다.

package step04;

public class Exam05 {
  public static void main(String[] args) {
    //& (AND) => 특정 비트들을 걸러내는 효과가 있다.
    int a = 0b0101_0011;
    int b = 0b0000_1111;  //masking (앞의 4자리는 막고 뒤의 4자리는 뚫어놓는다(a의 값이 그대로 내려옴))
    String result = Integer.toBinaryString(a & b); // Integer.toBinaryString : 입력해준 숫자값을 2진수로 표현한 String 문자열을 메모리에 저장한 후 그 주소값을 리턴 -> result엔 주소값이 저장
                                                   // 앞의 0은 생략
                                                   // 0000_1111
    System.out.println(result);

    // | (OR) => 특정 비트의 값을 강화하는 효과가 있다. (이미지로 치면 빛을 강화시킴 = 더 밝게만듦)
    // String result = Integer.toBinaryString(a | b); 변수는 한번 선언하면 그 블럭 안에서 중복 선언할 수 없음
    result = Integer.toBinaryString(a | b);
    System.out.println(result); //0101_1111

    // ~ (NOT) => 전체 비트의 값을 반전시키는 효과가 있다.
    result = Integer.toBinaryString(~a); //1010_1100
    System.out.println(result);

    // ^ (Exclusive OR) => 특정 비트의 값을 제거(반전)하는 것
    a = 0b0101_0011;
    b = 0b1111_1111;
    result = Integer.toBinaryString(a ^ b); // 둘 다 다를때만 1 => b가 다 1이기 때문에 1이 아닌 bit만 추출
                                            // 1010_1100
    System.out.println(result);

    a = 0b0101_0011;
    b = 0b0000_1111;  //앞의 4비트는 원본 그대로, 뒤의 4비트는 원본을 반전시킴
    System.out.println(result);
    }
  }

/*






*/
