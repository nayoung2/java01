package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
For given n and k find the sum of all multiples of k
that are not greater than n.
Example
sumOfMultiples(7, 2) = 2 + 4 + 6 = 12
[input] integer n
positive integer
[input] integer k
positive integer
[output] integer
 */
public class Test13 {
  public static void main(String[] args) {

    int result = 0;
    int n = 7;
    int k = 2;
    for (int i = 1; i <= n; i++) {
      if (i % k == 0) {
        result+=i;
      }
    }
    System.out.println(result);
   }
  }
