package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Year is leap if its number is divisible by 4 and isn't divisible by 100 or if its number is divisible by 400. Determine if a given year is leap or not.
[input] integer year
number of the year
[output] boolean
true if the given year is leap, false otherwise
 */


//① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
//② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
//③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.


public class Test18 {
  static boolean leapYear(int year) {

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      return true;
    }
    return false;
  }


  public static void main(String[] args) {
    System.out.println(leapYear(1000));
    //expected output
    //false
  }

}
