public class MaximumConsecutiveElements {

  public static void main(String[] args) {
    int arr1[] = {1, 1, 0, 1, 1, 1};
    System.out.println("Maximum Consecutive : " + findMaximumConsecutiveElements(arr1, 1
    ));
  }

  public static int findMaximumConsecutiveElements(int arr[], int element) {
    int sum = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        sum++;
        if (sum > max) {
          max = sum;
        }
      } else {
        sum = 0;
      }
    }
    return max;
  }

}
