/* 주제: 중첩된 for 문 나가기  */
package step05;

public class Exam17 {
  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
      System.out.printf("%d x %d = %d\n", i, j, i * j);
      if (i == 5 && j == 6)
        break;  // 자신을 감싸는 반복문을 나간다.
      }
    }
    System.out.println("-------------------------------");
    ohmygod:{ //for문에 label 붙임
    for (int i = 2; i < 10; i++) {                                             ////////////////////
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i * j);
        if (i == 5 && j ==6)                                                     //{}없을 시 label의 범위 = 한 문장.
        break ohmygod; //자신을 감싸는 반복문을 나간다.
      }
    }                                                                          /////////////////////
    System.out.println("끝~~");
  }
}


}







//
//
//
// public class Exam17 {
//   public static void main(String[] args) {//
//
//     for (int i = 2; i < 10; i++) {
//       for (int j = 1; j < 10; j++) {
//         System.out.printf("%d x %d = %d\n", i, j, i * j);
//         if (i == 5 && j ==6)
//            break;
//
//       }
//     }
//
//   }
//
//
//
//
//
// }
