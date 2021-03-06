// 주제 : 키보드로부터 데이터 읽기

package step17;

import java.util.Scanner;
// Scanner가 어느 패키지에 있는지 정확하게 지정해 주어야 한다. => import 이용하여 컴파일러에게 알린다.
// 가져오는 것이 아니당!

public class Exam01 {
  public static void main(String[] args) {
    // Scanner 생성자에 입력장치를 등록한다.
    Scanner keyScan = new Scanner(System.in);

    String str = keyScan.nextLine();  // 한 라인을 입력할 때 까지(엔터를 칠 때 까지) 다음으로 넘어가지 않고 기다림.
    System.out.println("--->" + str);

    str = keyScan.nextLine();
    System.out.println("--->" + str);

    str = keyScan.nextLine();
    System.out.println("--->" + str);

  }
}

/*
System.in : 키보드를 가리키는 레퍼런스
System.out : 콘솔을 가리키는 레퍼런스
System.err : 콘솔을 가리키는 레퍼런스
Scanner : 특정 입력 장치로부터 데이터를 읽어 들이는 도구.

*/
