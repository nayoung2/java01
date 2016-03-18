/*주제 : 값의 표현(Literal).*/

package step01;

public class Exam07 {
  public static void main(String[] args){
    System.out.println("문자열"); //object
    System.out.println(20); //4byte
    System.out.println(20L); //8byte (이 표현을 많이 사용)
    System.out.println(20l); //8byte, 소문자 l은 숫자 1과 구분이 힘든 경우가 있다
    System.out.println(3.14159); //8byte (부동소수점은 이 표현을 많이 사용)
    System.out.println(3.14159F); //4byte
    System.out.println(3.14159f); //4byte (F보다 이 표현을 많이 사용) - 소문자도 숫자와 헷갈리지 않고 키보드 기본세팅이 소문자이기 때문에
    System.out.println(false);   //1byte
    System.out.println(true);   //1byte
    System.out.println('A');   //2byte
    System.out.println('가');  //2byte
    //System.out.println('가나');  //오류!

  }
}

/*
리터럴(Literal)
- 자바 코드로 표현한 값. 코드에서 값을 표현한 것.
1) 문자열 : 큰 따옴표("")로 표현한다.
2) 숫자 : 4바이트/8바이트 숫자로 표현할 수 있다.
4바이트 : 20
8바이트 : 20L, 20l
3) 소수점이 있는 숫자(부동소수점) : 4바이트/8바이트로 표현
  4바이트 : 3.14159F , 3.14159f
  8바이트 : 3.14159, 3.14159F
4) 논리값 : true 또는 false로 표현
5) 문자 : 작은따옴표 ('')로 표현. 한 개의 문자 표현.

**정수는 4바이트짜리 정수를 많이 사용하고, 부동소수점은 8바이트를 많이 사용한다.
  => 정수가 4byte에 들어갈 수 있으면 (-2147483648 ~ 2147483647범위에 있으면) L을 안붙여도 되지만
    저 범위를 넘어가면 L을 붙여줘야한다.

*/

//적은 값(ex)1)을 집어 넣던지 큰 값(ex)약 21억)을 집어 넣던지 같은 크기(ex)4byte)의 메모리를 준비해야한다...
//=>밥을 적게 담던지 많이 담던지 정해진 크기의 밥그릇을 사용하는것과 비교해볼 수 있겠다...
