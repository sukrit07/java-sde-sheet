import java.util.HashMap;

public class ArrayUnionIntersect {

  public static void main(String[] args) {
    int arr1[] = {13, 46, 24, 52, 20, 9};
    int arr2[] = {7, 4, 241, 52, 2, 70, 6};

    doIntersection(arr1, arr2);
    doUnion(arr1, arr2);

  }

  public static void doIntersection(int arr1[], int arr2[]) {
    HashMap<Integer, Integer> numberMap = new HashMap<>();
    for (int i : arr1) {
      numberMap.put(i, i);
    }
    System.out.println("Common Elements:");
    for (int i : arr2) {
      if (numberMap.containsKey(i)) {
        System.out.print(i + ",");
      }
    }
  }


  public static void doUnion(int arr1[], int arr2[]) {
    HashMap<Integer, Integer> numberMap = new HashMap<>();
    for (int i : arr1) {
      numberMap.put(i, i);
    }
    for (int i : arr2) {
      if (numberMap.containsKey(i) == false) {
        numberMap.put(i, i);
      }
    }
    System.out.println("\nUnion Elements:");
    for (int i : numberMap.keySet()
    ) {
      System.out.print(i + ",");
    }
  }
}
