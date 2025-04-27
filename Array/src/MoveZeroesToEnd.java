public class MoveZeroesToEnd {

  public static void main(String[] args) {
    int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    moveZeroes(arr);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void moveZeroes(int arr[]) {
    int j = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        j = i;
        break;
      }
    }
    if (j == -1) {
      System.out.println("No zeroes in array");
    }
    for (int i = j + 1; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
  }
}
