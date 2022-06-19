package Arrays;

import java.util.*;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
      // Write your code here.
      Arrays.sort(coins);
      int currentMinimumChange = 0;
  
      // [1,2,5]
      for (int i = 0; i < coins.length; i++) {
        if (coins[i] > currentMinimumChange + 1) {
          return currentMinimumChange + 1;
        }
        currentMinimumChange += coins[i];
      }
      
      return currentMinimumChange + 1;
    }
  }
