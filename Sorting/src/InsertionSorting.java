public class InsertionSorting {


  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    System.out.println("Before Using insertion Sort: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("After sorting : ");
    insertionSort(arr, n);
  }

  public static void insertionSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
