package Arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
      int size = array.length;
      int[] squaredArray = new int[size];
      
      int startPtr = 0;
      int endPtr = size - 1;
  
      int leftElem = 0;
      int rightElem = 0;
  
      for (int i = size - 1; i >= 0; i--) {
        leftElem = array[startPtr];
        rightElem = array[endPtr];
        if (Math.abs(leftElem) > Math.abs(rightElem)) {
          squaredArray[i] = leftElem * leftElem;
          startPtr++;
        } else {
          squaredArray[i] = rightElem * rightElem;
          endPtr--;
        }
      }
      return squaredArray;
    }
}
