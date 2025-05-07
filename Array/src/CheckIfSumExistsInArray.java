import java.util.HashMap;

public class CheckIfSumExistsInArray {

  public static void main(String[] args) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 15;
    String ans = checkSum(n, arr, target);
    System.out.println(ans);
  }

  public static String checkSum(int n, int arr[], int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int diff = target - arr[i];
      if (numMap.containsKey(diff)) {
        return numMap.get(diff).toString() + "," + String.valueOf(i);
      }
      numMap.put(arr[i], i);
    }
    return "-1,-1";
  }


}
