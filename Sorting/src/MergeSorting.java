import java.util.ArrayList;
import java.util.Scanner;

public class MergeSorting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 7;
    int arr[] = {9, 4, 7, 6, 3, 1, 5};
    System.out.println("Before sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    MergeSorting.mergeSort(arr, 0, n - 1);
    System.out.println("After sorting array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int arr[], int beg, int end) {
    if (beg >= end) {
      return;
    }
    int mid = (beg + end) / 2;
    mergeSort(arr, beg, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, beg, mid, end);
  }

  public static void merge(int arr[], int beg, int mid, int end) {
    ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    int left = beg;      // starting index of left half of arr
    int right = mid + 1;
    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }
    while (right <= end) {
      temp.add(arr[right]);
      right++;
    }
    for (int i = beg; i <= end; i++) {
      arr[i] = temp.get(i - beg);
    }
  }
}
