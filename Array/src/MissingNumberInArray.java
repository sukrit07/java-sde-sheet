public class MissingNumberInArray {

  public static void main(String[] args) {
    int arr[] = {1, 2, 4, 5};
    int n = 5;
    findMissingNumber(arr, n);
  }

  public static void findMissingNumber(int arr[], int n) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    int actualSum = (int) (n * (n + 1)) / 2;
    System.out.println(actualSum - sum);
  }
}
