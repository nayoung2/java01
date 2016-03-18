/*주제 : 특수 문자의 표현 - Escape 문자 사용*/

package step01;

public class Exam14 {
  public static void main(String[] args){
    System.out.print("Hello"); //ln을 붙이지 않으면 자동으로 줄바꿈이 되지 않음. (이어서 나옴)
    System.out.print('\b'); // ==> return backspce code 한 칸 뒤로 이동 : 0x0008 (System.out.print('(int)\b');)를 통해 알 수 있음.
    System.out.print("World!");
    System.out.print('\n'); // ==> return linefeed(LF) code : 0x000a (LF의 유니코드값)


    System.out.print('"'); // 작은 따옴표 안에서 큰 따옴표를 표현할 수 있다.
    System.out.print('\n');

    //System.out.print((int)"\""); //큰 따옴표 코드 : 0x0027       (int) 뒤에는 '' 를 써야하나보다/..
    System.out.print('\n');

  //  System.out.print("This is "홍길동""); 큰따옴표 안에 큰 따옴표 사용 => 오류
    //               ---------/------
    //                  문자열     ??

//특수문자에서 탈출해서 단순한 문자로 취급. 일반 문자로 취급 - 이스케이프
  System.out.print("This is \"홍길동\"");
  System.out.print("This is '홍길동'"); //큰따옴표 안 작은 따옴표는 역슬래시 붙여주지 않아도 됨.
  System.out.print('\n');

//System.out.print('''); 에러
  System.out.print('\'');
  System.out.print('\n');

//작은 따옴표에 대한 코드값
  System.out.print((int)'\''); //작은 따옴표 코드 : 0x0027
  System.out.print('\n');

   //System.out.print('\'); // \의 코드 값을 보고싶어도 '를 문자로 보는 특수문자로 사용되어 '의 짝이 없음 => 에러
   //따라서
   System.out.println('\\'); // 역슬래시의 코드값 : 0x005c
   //매번 System.out.print('\n');를 붙여주기 귀찮으니 println을 사용한다.




  }
}

/* 이스케이프 문자
- \b : backspace
- \t : tab
- \n : linefeed(LF)
- \f : formfeed
- \r : carrage return(CR)
- \" : doble quote
- \' : single quote
- \\ : backslash

줄바꿈?
- Windows OS의 경우 : 0D0A (2바이트로 표현)
- Unix/Linux OS : 0A
*/
