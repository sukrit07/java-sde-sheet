public class MaxSubArraySumKadanesAlgorithm {

  public static void main(String[] args) {
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    long maxSum = findMaxSubArraySumUsingKadaneAlgorithm(arr, arr.length);
    System.out.println("Max sub array sum: " + maxSum);
  }

  public static Long findMaxSubArraySumUsingKadaneAlgorithm(int arr[], int len) {
    long maxSum = Long.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < len; i++) {
      sum += arr[i];
      if (sum > maxSum) {
        maxSum = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    return maxSum;
  }

}
