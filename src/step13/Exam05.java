// 주제 : 날짜 데이터를 다루는 클래스3
package step13;

import java.util.Calendar;

public class Exam05 {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(); //Calendar는 new를 쓰지 않고 메소드를 이용하여 (스태틱 메소드(getInstance()) 내에서 new Calendar)//<==싱클톤 설계 패턴. (객체를 하나만 만들기 위하여)
    //Calendar cal = new Calendar(); // new 쓰면 오류

    //System.out.println(cal.get(옵션)); // Calendar 에서 어떤 값을 뽑을지 옵션

    // Calendar 옵션 값 알아내기
    // System.out.println(Calendar.YEAR);
    // System.out.println(Calendar.MONTH);
    // System.out.println(Calendar.DATE);
    // System.out.println(Calendar.HOUR);
    // System.out.println(Calendar.MINUTE);
    // System.out.println(Calendar.SECOND);
    // System.out.println(Calendar.DAY_OF_WEEK);
    // System.out.println(Calendar.DAY_OF_MONTH); // = Calendar.DATE


    System.out.println(cal.get(1)); // 년도
    System.out.println(cal.get(2)); // 월  ==> 0부터 11까지
    System.out.println(cal.get(2) + 1); // => 현재 월을 알고싶으면 +1 을 해줘야 한다.
    System.out.println(cal.get(5)); // 일
    System.out.println(cal.get(10)); // 시
    System.out.println(cal.get(12)); // 분
    System.out.println(cal.get(13)); // 초
    System.out.println(cal.get(7)); // 요일 (일요일부터 1)

    // get()의 아규먼트 값을 직접 숫자로 지정하기 보다는
    // 미리 정의된 스태틱 상수 변수를 사용하는 것이 ( => Exam11)
    // 코드를 읽고 쓸 때 편하다.
    int option = Calendar.YEAR;
    System.out.println(cal.get(option)); // 년도 (calendar의 YEAR라는 스태틱 변수에 1이라는 값이 저장되어있따.)
    System.out.println(cal.get(Calendar.MONTH)); // 월  ==> 0부터 11까지
    System.out.println(cal.get(Calendar.MONTH) + 1); // => 현재 월을 알고싶으면 +1 을 해줘야 한다.
    System.out.println(cal.get(Calendar.DATE)); // 일
    System.out.println(cal.get(Calendar.HOUR)); // 시
    System.out.println(cal.get(Calendar.MINUTE)); // 분
    System.out.println(cal.get(Calendar.SECOND)); // 초
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일 (일요일부터 1)

  }
}





































/*

*/
