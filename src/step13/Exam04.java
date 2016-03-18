// 주제 : 날짜 데이터를 다루는 클래스2
package step13;

import java.sql.Date;

public class Exam04 {
  public static void main(String[] args) {
    // Date today = new Date(); 적합하지 않은... 오류
    long currTime = System.currentTimeMillis(); //1970.1.1 0:0:0 ~ 밀리초
    Date today = new Date(currTime);
    System.out.println(today); // yyyy-MM-dd

    // java.sql.Date 클래스를 주로 사용하는 경우
    // 문자열 "yyyy-MM-dd" --> Date 인스턴스 (문자열을 날자 객체로 바꿈)
    Date date = Date.valueOf("2016-3-7");
    System.out.println(date);





  }
}














/*

*/
