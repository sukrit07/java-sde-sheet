import java.util.HashMap;

public class LongestSubArrayWithSumKOnlyPositives {

  public static void main(String[] args) {
    int[] a = {2, 3, 5, 1, 9};
    int k = 10;
    findSubsetLargest(a, k);
    findSubsetLargestOptimal(a, k);
  }

  public static void findSubsetLargest(int arr[], int k) {
    HashMap<Integer, Integer> sumPositionMap = new HashMap<>();
    int prefix = 0;
    int maxLen = -1;
    for (int i = 0; i < arr.length; i++) {
      prefix += arr[i];
      if (prefix == k) {
        if (i + 1 > maxLen) {
          maxLen = i + 1;
        }
      }
      if (sumPositionMap.containsKey(prefix - k)) {
        int len = i - sumPositionMap.get(prefix - k);
        if (len > maxLen) {
          maxLen = len;
        }
      } else {
        sumPositionMap.put(prefix, i);
      }
    }
    System.out.println("length : " + maxLen);

  }


  public static void findSubsetLargestOptimal(int arr[], int k) {
    int leftPoint = 0;
    int rightPoint = 0;
    int prefixSum = arr[0];
    int maxLen = -1;
    while (rightPoint < arr.length) {
      while (leftPoint <= rightPoint && prefixSum > k) {
        prefixSum -= arr[leftPoint];
        leftPoint++;
      }
      if (prefixSum == k) {
        maxLen = Math.max(maxLen, rightPoint - leftPoint + 1);
      }
      rightPoint++;
      if (rightPoint < arr.length) {
        prefixSum += arr[rightPoint];
      }
    }
    System.out.println("length : " + maxLen);

  }

}
