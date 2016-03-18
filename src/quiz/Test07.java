package quiz;
/*
Given an integer n, find the number of trailing zeros
in the decimal representation of n!
(the exclamation mark means factorial).
Example
for n = 10 output should be 2
[input] integer n
a positive integer
[output] integer
*/

public class Test07 {
  public static void main(String[] args) {
    int n = 10;
    int result = 0;
    for (int i = 5; i <= n; i += 5) {
      int number = i;
      while (number % 5 == 0) {
        number /= 5;
        result++;
      }
    }
    return result;
    }
  }
