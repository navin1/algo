package leetcode;

public class PalindromeNumber {

  public static void main(String[] args) {
    PalindromeNumber obj = new PalindromeNumber();
    int x = 121;
    boolean res = obj.isPalindrome(x);
    System.out.println(res);
  }

  public boolean isPalindrome(int x) {
    int temp = x;
    int num = 0;
    if(x<0)
      return false;
    while(x>0){
        num = 10*num + x%10;
        x = x/10;
    }
    return num==temp;
  }
}
