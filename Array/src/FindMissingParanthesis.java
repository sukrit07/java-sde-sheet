import java.util.HashMap;
import java.util.Map.Entry;

public class FindMissingParanthesis {

  public static void main(String[] args) {
    String sentence = "{{{{}}}";
    int charAtKey = findMissingParanthesis(sentence);
    System.out.println(charAtKey == 123 ? (char) (125) : (char) charAtKey);
  }

  public static int findMissingParanthesis(String str) {
    HashMap<Integer, Integer> charMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      int charPos = str.charAt(i);
      if (charMap.containsKey(charPos)) {
        charMap.put(charPos, charMap.get(charPos) + 1);
      } else {
        charMap.put(charPos, 1);
      }
    }
    int max = -1;
    int characterAtKey = -1;
    for (Entry<Integer, Integer> entry : charMap.entrySet()) {
      if (max < entry.getValue()) {
        max = entry.getValue();
        characterAtKey = entry.getKey();
      }
    }
    return characterAtKey;
  }

}
