package BinarySearchTrees;

public class FindClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
      return findClosestValueInBst(tree, target, tree.value);
    }
  
    public static int findClosestValueInBst(BST tree, int target, int closestValue) {
      BST currentNode = tree;
  
      while (currentNode != null) {
        if (Math.abs(target - closestValue) > Math.abs(target - currentNode.value)) {
          closestValue = currentNode.value;
        }
  
        if (target < currentNode.value) {
          currentNode = currentNode.left;
        } else if (target > currentNode.value) {
          currentNode = currentNode.right;
        } else {
          break;
        }
      }
      return closestValue;
    }
  
    static class BST {
      public int value;
      public BST left;
      public BST right;
  
      public BST(int value) {
        this.value = value;
      }
    }
  }
