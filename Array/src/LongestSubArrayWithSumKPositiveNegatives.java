import java.util.HashMap;

public class LongestSubArrayWithSumKPositiveNegatives {

  public static void main(String[] args) {
    int[] a = {2, 3, 5, 1, 9};
    int k = 10;
    findSubsetLargestOptimal(a, k);
  }

  public static void findSubsetLargestOptimal(int arr[], int k) {
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


}
