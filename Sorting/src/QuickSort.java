import java.util.Scanner;

public class QuickSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 7;
    int arr[] = {9, 4, 7, 6, 3, 1, 5};
    System.out.println("Before sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    QuickSort.qs(arr, 0, n - 1);
    System.out.println("After sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void qs(int arr[], int low, int high) {
    if (low < high) {
      int pInd = findPosition(arr, low, high);
      qs(arr, low, pInd - 1);
      qs(arr, pInd + 1, high);
    }
  }

  public static Integer findPosition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;
    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }
      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        swap(arr, i, j);
      }
    }
    swap(arr, low, j);
    return j;
  }

  public static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
