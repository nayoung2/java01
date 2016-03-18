// 주제 : 날짜 데이터를 다루는 클래스
package step13;

import java.util.Date;

public class Exam03 {
  public static void main(String[] args) {
    Date today = new Date(); // 인스턴스에는 오늘 날짜와 시간이 들어 있다 ( 우리나라 시간 ) //1970.1.1 0:0:0 ~ 밀리초,long 타입으로


    // println(레퍼런스)
    // => println()은 레퍼런스에 대해 toString()을 실행한 후
    //    그 리턴 값을 출력한다. (주소 값을 출력하지 않는당!!!) 해시코드 역시 주소가 아니다! (step12 Exam10)
    //(toString 메소드를 호출한 후 그 메소드가 리턴한 값을 출력! java의 모든 클래스는 toString() 메소드를 갖는다. => step12 Exam10도 가진다.)
    System.out.println(today);
    System.out.println(today.toString()); // 위의 코드와 같다.
    ////////// Date 쓰지 않도록 한다... 클래스 내의 메소드들이 다 Deprecated. => Exam04


  }
}

/*

*/
