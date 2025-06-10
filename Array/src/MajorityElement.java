import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public static void main(String args[]) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int ans = majorityElementUsingHashMap(arr);
    System.out.println("The majority element is: " + ans);
    ans = majorityElementUsingMooreVotingAlgorithm(arr);
    System.out.println("The majority element is: " + ans);

  }

  public static int majorityElementUsingMooreVotingAlgorithm(int arr[]) {
    int count = 0, majorityElement = 0;
    for (int i = 0; i < arr.length; i++) {
      if (count == 0) {
        majorityElement = arr[i];
        count = 1;
      } else if (majorityElement == arr[i]) {
        count++;
      } else {
        count--;
      }
    }

    for (int n : arr) {
      if (n == majorityElement) {
        count++;
      }
    }
    if (count > (arr.length) / 2) {
      return majorityElement;
    } else {
      return -1;
    }
  }

  public static int majorityElementUsingHashMap(int arr[]) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int n : arr) {
      if (countMap.containsKey(n)) {
        countMap.put(n, countMap.get(n) + 1);
      } else {
        countMap.put(n, 1);
      }
    }

    int max = -1;
    int maxElement = -1;
    for (Map.Entry<Integer, Integer> entrySet : countMap.entrySet()
    ) {
      if (entrySet.getValue() > max) {
        max = entrySet.getValue();
        maxElement = entrySet.getKey();
      }
    }
    return maxElement;
  }

}
