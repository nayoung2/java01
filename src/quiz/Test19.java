package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
You are given an array of integers representing coordinates of obstacles
situated on a straight line.
Assume that you are jumping from the point with coordinate 0 to the right.
You are allowed only to make jumps of the same length represented
by some integer.
Find the minimal length of the jump enough to avoid all the obstacles.
Example
for [5, 3, 6, 7, 9] output should be 4
[input] array.integer inputArray
non-empty array of positive integers
[output] integer
the desired length
 */
 public class Test19 {
   public static void main(String[] args) {
    int[] inputArray = new int[]{5,3,6,7,9};
    int a = 0;
    mymy: {
      for (int i = 1; ; i++) {
        for (int j = 0; j < inputArray.length; j++) {
          if (inputArray[j] % i == 0) {
            break;
          }
          if (j == inputArray.length - 1) {
            System.out.println(i);
            a = 1;
            break mymy;
          }
        }

        }
      }
    }
    }
  
