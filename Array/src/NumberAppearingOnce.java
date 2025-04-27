/*Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.*/


public class NumberAppearingOnce {

  public static void main(String[] args) {
    int arr[] = {2, 2, 21};
    findNumberAppearingOnce(arr);
  }

  public static void findNumberAppearingOnce(int arr[]) {
    int num = arr[0];
    for (int i = 1; i < arr.length; i++) {
      num = num ^ arr[i];
    }
    System.out.println(num);
  }

}
