public class RightLeftRotate {

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    leftRotate(arr);
    rightRotate(arr);
  }

  public static void leftRotate(int arr[]) {
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = temp;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

  public static void rightRotate(int arr[]) {
    int temp = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = temp;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

}
