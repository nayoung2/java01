package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
A fraction written as a/b is said to be a proper fraction
if the absolute value of the fraction is strictly less than one.
Otherwise it is called an improper fraction.
Determine whether a given fraction is proper.
Example
properOrImproper([7, 2]) = "Improper"
[input] array.integer A
array of two integers representing a fraction A[0] / A[1]
[output] string
"Proper" if A contains a proper fraction, "Improper" otherwise
 */

public class Test15 {
  public static void main(String[] args) {
    int[] A = new int[]{7,2};
        if (Math.abs(A[0] / A[1]) < 1) {
          System.out.println("Proper");
        }
    else System.out.println("Improper");
   }
  }
