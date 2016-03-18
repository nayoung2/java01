package quiz;
/*
A geometric progression is a sequence of numbers
where each term after the first is found
by multiplying the previous one by a fixed, non-zero number.
Example
isGeometricProgression([1, 4, 16]) = true
isGeometricProgression([2, 4, 8, 17, 34]) = false
[input] array.integer sequence
array of integers
[output] boolean
true if sequence represents a geometric progression,
*/

public class Test06 {
  public static void main(String[] args) {
    int[] values = new int[]{2, 4, 8, 17, 34};
    for (int i = 2; i < values.length; i++) {
     if (values[i] * values[0] != values[i - 1] * values[1]) {
       return false;
        }
      }
   return true;
    }
  }
