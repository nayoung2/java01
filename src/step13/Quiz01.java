/* 문제1) 입력 받은 두 수 중 더 큰 수를 출력하시오.
> java -cp bin step13.Quiz01 34 78
> 78
*/

/* 문제2) 두 수 사이에 있는 수 중에서 짝수 값을 출력하시오.
> java -cp bin step13.Quiz02 4 12
> 4, 6, 8, 10, 12
*/

/* 문제3) 주어진 수의 약수를 모두 출력하시오.
> java -cp bin step13.Quiz03 72
> 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72
*/

/* 문제4) 주어진 수를 오름차순으로 정렬하시오.
> java -cp bin step13.Quiz04 64 5 2 74 13 98
> 2, 5, 13, 64, 74, 98
*/

package step13;

public class Quiz01 {
  public static void main(String[] args) {
    int max = 0;
    int[] arg = new int[args.length];
    for (int i = 0; i < args.length; i++){
      arg[i] = Integer.parseInt(args[i]);      
      if (arg[i] > max) {
        max = arg[i];
      }
    }
    System.out.println(max);
  }

}
