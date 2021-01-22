package leetcode;

public class ReverseInteger {
  public static void main(String[] args) {
    ReverseInteger obj = new ReverseInteger();
    int x = 1463847412;
    System.out.println(x);
    int res = obj.reverse(x);
    System.out.println(res);
  }

  public int reverse(int x) {
    int num = 0;
    boolean isNeg = false;
    if (x < 0) {
      x = -1 * x;
      isNeg = true;
    }
    while (x > 0) {
      if ((x > 0 && num > Integer.MAX_VALUE / 10)) {
        return 0;
      }
      num = num * 10 + (x % 10);
      x = x / 10;
    }
    return isNeg ? -1 * num : num;
  }
}
