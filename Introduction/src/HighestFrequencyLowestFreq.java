import java.util.HashMap;
import java.util.Map;

//Given an array of size N. Find the highest and lowest frequency element.
//Time Complexity: O(N), where N = size of the array. The insertion and retrieval operation in the map takes O(1) time.
//Space Complexity:  O(N), where N = size of the array. It is for the map we are using.

public class HighestFrequencyLowestFreq {

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
    int highestEle = 0;
    int highestFrequency = -2;
    int lowestFrequency = n;
    int lowestEle = 0;
    for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
      if (entry.getValue() > highestFrequency) {
        highestFrequency = entry.getValue();
        highestEle = entry.getKey();
      }
      if (entry.getValue() < lowestFrequency) {
        lowestFrequency = entry.getValue();
        lowestEle = entry.getKey();
      }
    }
    System.out.println(
        "Highest frequency element is : " + highestEle + " freq : " + highestFrequency);
    System.out.println("Lowest frequency element is : " + lowestEle + " freq : " + lowestFrequency);
  }

}
