import java.util.HashMap;
//Problem statement: Given an array, we have found the number of occurrences of each element in the array.
//Time Complexity: O(N)
//Space Complexity: O(n)

public class FrequencyOfEachNumberInArr {

  public static void main(String[] args) {
    int arr[] = {1, 2, 6, 7, 6, 6};
    int n = arr.length;
    countFreq(arr, n);
  }

  public static void countFreq(int arr[], int n) {
    HashMap<Integer, Integer> frequency = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int element = arr[i];
      int c = 0;
      if (frequency.containsKey(element)) {
        c = frequency.get(element);
      }
      c++;
      frequency.put(element, c);
    }
    frequency.entrySet()
        .forEach(value -> System.out.println(value.getKey() + " - " + value.getValue()));
  }

}
