public class LeftRotateNPlaces {

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int arr1[] = {13, 46, 24, 52, 20, 9};
    int arr2[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    leftRotateNPlaces(arr, 1);
    leftRotateNPlacesUsingOptimal(arr1, 2);
    rightRotateNPlacesUsingOptimal(arr2, 3);
  }

  public static void leftRotateNPlaces(int arr[], int n) {
    int temp[] = new int[n];
    int k = 0;
    for (int i = 0; i < n; i++) {
      temp[i] = arr[i];
    }
    for (int i = n; i < arr.length; i++) {
      arr[k] = arr[i];
      k++;
    }
    k = 0;
    for (int i = arr.length - n; i < arr.length; i++) {
      arr[i] = temp[k];
      k++;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

  public static void leftRotateNPlacesUsingOptimal(int arr[], int n) {
    reverseArray(arr, 0, n - 1);
    reverseArray(arr, n, arr.length - 1);
    reverseArray(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

  public static void rightRotateNPlacesUsingOptimal(int arr[], int n) {

    reverseArray(arr, 0, arr.length - 1);
    reverseArray(arr, 0, n - 1);
    reverseArray(arr, n, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

  public static void reverseArray(int arr[], int begin, int ending) {

    while (begin <= ending) {
      int temp = arr[begin];
      arr[begin] = arr[ending];
      arr[ending] = temp;
      begin++;
      ending--;
    }
  }


}
