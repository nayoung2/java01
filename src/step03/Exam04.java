/* 주제 : 배열과 레퍼런스 관계 */

package step03;

public class Exam04{
  public static void main(String[]args){
    int[] a = new int[]{10, 20, 30};
    int[] b = new int[]{100, 200, 300};
    int[] c = a;
    // int[] d;
    // d = 20; //int값(20)을 주소값으로 바꿀 수 없다
    // d = char[4];
    //
    System.out.printf("%d %d %d\n", a[1], b[1], c[1]);

    c[1] = 500;
    System.out.println(a[1]);


    }
  }

/*


*/
