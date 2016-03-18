/*주제 : 문자 값 표현*/

package step01;

public class Exam13 {
  public static void main(String[] args){
    System.out.println((char)0x0041);
    System.out.println((char)0x0042);
    System.out.println((char)0x0061);
    System.out.println((char)0x0062);
    System.out.println((char)0xAC00);
    System.out.println((char)0xAC01);

//자바에서 제공하는 특수한 연산자 ''
//숫자로 된 코드를 다 외울수는 없기때문에
// => '' 안에 있는 문자에 대해 유니코드 값을 리턴한다. 즁여
//(Unicode 11172자를 다 외울 수 없기 때문에...)

    System.out.println('A'); //A의 유니코드값을 받아서 A를 출력하는 것.
    System.out.println('a');
    System.out.println('가');

    int a = 'A'; // ' ' 연산자는 A문자에 대한 유니코드 값을 리턴한다.  즉, 변수 a에 문자 A의 유니코드 값을 저장한다. 문자를 메모리에 저장하는것이 아니다!!
    int b = 'a';  // ' ' 연산자는 a문자에 대한 유니코드 값을 리턴한다.
    int c = '가'; // ' ' 연산자는 가문자에 대한 유니코드 값을 리턴한다.

    char k = '가'; //역시 변수 k에 문자가 아니라 2byte의 숫자값이 저장되는 것
    System.out.println(Integer.toHexString(a)); //16진수로 출력 -> 41
    System.out.println(Integer.toHexString(b)); //61
    System.out.println(Integer.toHexString(c)); //ac00

    //특수 명령 \ u
    System.out.println('\uac00');
    System.out.println('\uac01');
     }
}



/*
자바의 문자
- 자바는 유니코드 명세에 따라 문자를 2바이트 메모리에 저장한다.
A => 0x0041 =>이진수 0000 0000 0100 0001
B => 0x0042 => 0000 0000 0100 0010
a => 0x0061
b => 0x0062
가 => 0xAC00
각 => 0xAC01

1) ASCII(7bit)
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 ---- ---- ---- => 한글이 다 정의 X
7bit => 최대 128자 밖에 지정하지 못한다

2) ISO-8859-1(8bit)
- ASCII + 유럽문자
영어에 어떤 나라의 언어를 추가로 지정했는지에 따라
ISO-8859-1, ISO-8859-2, ISO-8859-3, 으로 분류
But 한글을 표현 X

3) EUC-KR(16bit)
-2350자의 한글 정의
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b0ca ---- b6cb
1byte로 표현하지 못하는 문자들을...ex)한글,일본어(EUC-JP),중국어...


4) 조합형(16bit)
- 초성 (5비트), 중성(5비트), 종성(5비트)로 정의
- 첫 비트는 한글이라는 의미로 1로 설정
- 1[초성5비트][중성5비트][종성5비트] = 16비트
- 국제 표준 아니다.
(한글 내에서만 사용됨)

5) MS949(16bit)
- 윈도우95부터 추가된 문자집합
- EUC-KR + 추가한글 = 11172자
- 국제 표준 아니다.
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca 8c63 b6cb

6) Unicode(16bit)
- 영어, 한글 모두 2바이트로 정의함.
- 한글은 새로운 코드 값으로 정의함 => EUC-KR과 호환이 안됨. => 새로 작성해야 함.
ABCabc각가간똘똠똥 ==> 0041 0042 0043 0061 0062 0063
                       AC01 AC02 AC04 ...
- 참고
  유니코드의 버전이 2바이트에서 4바이트로 옮겨가고 있다.

7)UTF-8(1~4바이트)
- 유니코드 문자를 재정의 함.됨
- 1바이트로 표현 가능한 것은 그대로 1바이트로 표현하고,
- 2바이트 문자는 2 ~ 4바이트로 변환하여 표현한다.
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 EABO80 EAB081 EAB084 ...
- 이점: 영어의 경우 ISO-8859-1과 완벽하게 호환된다.
        => 영어 문서는 UTF-8로 바꿔도 기존의 문서와 같다.
        => ISO-8859-1로 저장된 문서를 UTF-8로 바꿀 필요가 없다.
-       10만자 이상되는 중국 한자를 모두 표현할 수 있다. (4byte로 표현할 수 있기 때문에)
- 단점: 한글의 경우 3바이트로 저장되기 때문에 용량이 50% 증가하는 문제가 있다.

-참고
  유니코드의 버전ㅇ이 2바이트에서 4바이트로 옮겨가고 있다 (아직 4바이트는 불안정)
  즁귝어..

*\ u 를 이용한 문자 표현
- 문법 : '\ u유니코드'
  예) '\uac00','\uac41'


*/
