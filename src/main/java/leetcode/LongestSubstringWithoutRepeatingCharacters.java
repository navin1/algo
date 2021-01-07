package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
    String str = "acbacbd";
    int res = obj.lengthOfLongestSubstring(str);
    System.out.println(res);
  }

  public int lengthOfLongestSubstring(String s) {
    int left = 0;
    int right = 0;
    Set<Character> set = new HashSet<Character>();
    int maxSubstringLength = 0;
    while (right < s.length()) {
      if (!set.contains(s.charAt(right))) {
        set.add(s.charAt(right));
        maxSubstringLength = Math.max(maxSubstringLength, set.size());
        right++;
      } else {
        set.remove(s.charAt(left));
        left++;
      }
    }
    return maxSubstringLength;
  }
}
