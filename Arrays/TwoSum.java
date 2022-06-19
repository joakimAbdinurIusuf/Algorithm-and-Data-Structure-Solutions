package Arrays;

import java.util.*;

public class TwoSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> setOfNums = new HashSet<>();

    for (int num : array) {
      int num2 = targetSum - num; // Using the fact that num + num2 should be 10
      if (setOfNums.contains(num2)) {
        int[] twoNums = {num, num2};
        return twoNums;
      } else {
        setOfNums.add(num);
      }
    }
    
    return new int[0];
  }

}
