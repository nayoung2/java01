package step09;

public class quiz {
  static int testFraction(int[] n, int[] d) {
    int maxindex = 0;
    for (int i = 1; i < n.length; i++) {
      if (d[maxindex] * n[i] > n[maxindex] * d[i]) {
        maxindex = i;
      }
    }    
    return maxindex;
  }

  public static void main(String[] args) {
    int index = testFraction(new int[]{5, 2, 5}, new int[]{6, 3, 4});
    System.out.println(index);
  }
}
