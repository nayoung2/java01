/* 주제: final 상수 활용 */
package step12;

public class Exam13 {
  public static void main(String[] args) {
    int result = Car10.plus(20,30);


  }
}

/*
# 파라미터 변수 앞에 final을 붙이는 경우
- 파라미터의 용도는 외부에서 보낸 값을 받기 위함이다.
- 가능한 그 메서드 안에서는 파라미터를 조회용으로만 사용하는 것이 안전하다.
- 이것을 강제시키는 방법으로 파라미터를 final로 선언한다.

cf> 레퍼런스 변수에 final => 레퍼런스에 저장된 주소값을 바꿀 수 없는 것.
  그 주소에 있는 값을 바꾸지 못하는 것은 아니다.


*/
