package leetcode;

public class LongestPalindromicSubstring {
  public static void main(String[] args) {
    LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
    String str = "ramaxyx";
    String s = obj.longestPalindrome(str);
    System.out.println(s);
  }

  public String longestPalindrome(String str) {
    int maxLength = 1;
    int start = 0;
    int len = str.length();
    int low, high;
    for (int i = 1; i < len; ++i) {
      low = i - 1;
      high = i;
      while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
        if (high - low + 1 > maxLength) {
          start = low;
          maxLength = high - low + 1;
        }
        --low;
        ++high;
      }

      low = i - 1;
      high = i + 1;
      while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
        if (high - low + 1 > maxLength) {
          start = low;
          maxLength = high - low + 1;
        }
        --low;
        ++high;
      }
    }
    return str.substring(start, start + maxLength);
  }
}
