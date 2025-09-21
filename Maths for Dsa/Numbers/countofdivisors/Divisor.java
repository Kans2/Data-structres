

import java.util.*;

public class Divisor {
    public static void main(String[] args) {
    int N = 36;
    int[] divisors = Divisors(N);
    System.out.println(Arrays.toString(divisors));
    }

  public static int[] Divisors(int N) {
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= Math.sqrt(N); i++) {
      if (N % i == 0) {
        result.add(i);
        if (N / i != i) {  //avoid duplicates  
          result.add(N / i);
        }
      }
    }
    Collections.sort(result);
    // Convert List<Integer> to int[]
    int[] arr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      arr[i] = result.get(i);
    }
    return arr;
  }
}
