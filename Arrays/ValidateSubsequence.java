package Arrays;

import java.util.*;

public class ValidateSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrayPointer = 0;
    int sequencePointer = 0;

    while (arrayPointer < array.size() && sequencePointer < sequence.size()) {
      if (array.get(arrayPointer).equals(sequence.get(sequencePointer))) {
        sequencePointer += 1;
      }
      if (sequencePointer == sequence.size()) {
        return true;
      }
      arrayPointer += 1;
    }
    return false;
  }
}

