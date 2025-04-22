public class SecondLargestSmallest {

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    findSecondLargestSmallest(arr);
  }

  public static void findSecondLargestSmallest(int arr[]) {
    int largest = arr[0];
    int second_largest = arr[0];
    int smallest = arr[0];
    int second_smallest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        int temp = largest;
        largest = arr[i];
        second_largest = temp;
      }
      if (second_largest < arr[i] && arr[i] != largest) {
        second_largest = arr[i];
      }
      if (arr[i] < smallest) {
        int temp = smallest;
        smallest = arr[i];
        second_smallest = temp;
      }
      if (second_smallest > arr[i] && arr[i] != smallest) {
        second_smallest = arr[i];
      }
    }
    System.out.println("Second Largest :" + second_largest);
    System.out.println("Second Smallest :" + second_smallest);
  }
}
