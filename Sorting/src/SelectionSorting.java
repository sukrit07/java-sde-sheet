public class SelectionSorting {

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    System.out.println("Before Using insertion Sort: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    selectionSort(arr, n);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void selectionSort(int arr[], int n) {
    int min = arr[0];
    int pos = 0;
    for (int i = 0; i < n; i++) {
      min = arr[i];
      int temp = arr[i];
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < min) {
          pos = j;
          min = arr[j];
        }
      }
      arr[i] = min;
      arr[pos] = temp;
    }
  }

}
