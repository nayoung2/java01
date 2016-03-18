/*
5명의 회원 정보를 입력받아서 보관하라!
>java -cp bin step17.Quiz
 이름? 홍길동
 이메일? hong@tes.com
 암호? 1111
 전화? 111-1111
 정말 저장하시겠습니까?(y/n)y
 저장했습니다.

 이름? 임꺽정
 이메일? leem@tes.com
 암호? 1111
 전화? 111-2222
 정말 저장하시겠습니까?(y/n)y
 저장했습니다.

 이름? 임꺽정2
 이메일? leem@tes.com
 암호? 1111
 전화? 111-2222
 정말 저장하시겠습니까?(y/n)y
 저장했습니다.

 이름? 임꺽정3
 이메일? leem@tes.com
 암호? 1111
 전화? 111-2222
 정말 저장하시겠습니까?(y/n)x
 정말 저장하시겠습니까?(y/n)n
 입력 취소하셨습니다.

 이름? 오호라
 이메일? ohora@tes.com
 암호? 1111
 전화? 111-2222
 정말 저장하시겠습니까?(y/n)y
 저장했습니다.

 이름? 임꺽정4
 이메일? leem@tes.com
 암호? 1111
 전화? 111-2222
 정말 저장하시겠습니까?(y/n)y
 저장했습니다.

 지금까지 입력한 회원 정보는 다음과 같습니다.
-------------------------------------------------
홍길동, hong@test.com, 1111, 111-1111
임꺽정, leem@test.com, 1111, 111-2222
임꺽정2, leem@test.com, 1111, 111-2222
임꺽정3, leem@test.com, 1111, 111-2222
임꺽정4, leem@test.com, 1111, 111-2222

*/
package step17;

import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] tel = new String[5];

    for(int i = 0; i < 5; i++) {
      System.out.printf("%s ", "이름 ?");
      name[i] = keyScan.nextLine();
      System.out.printf("%s ", "이메일 ?");
      email[i] = keyScan.nextLine();
      System.out.printf("%s ", "암호 ?");
      password[i] = keyScan.nextLine();
      System.out.printf("%s ", "전화 ?");
      tel[i] = keyScan.nextLine();
      String str = new String();
      int a = 0;
      while (a == 0) {
        System.out.printf("%s", "정말 저장하시겠습니까 ? (y/n) ");
        str = keyScan.nextLine();
        str = str.toLowerCase();
        switch(str) {
          case "y" :
            System.out.println(" 저장했습니다. ");
            System.out.println();
            a = 1;
            break;
          case "n":
            System.out.println(" 입력 취소하셨습니다.");
            System.out.println();
            a = 1;
            i--;
            break;
        }
      }
    }
    System.out.println("지금까지 입력한 정보는 다음과 같습니다");
    System.out.println("---------------------------------------");
    for(int i = 0; i < 5; i++) {
      System.out.printf("%s, %s, %s, %s\n", name[i], email[i], password[i], tel[i]);
    }
  }
}
