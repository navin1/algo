package leetcode;

import java.util.Stack;

public class ValidParentheses {
  public static void main(String[] args) {
    ValidParentheses obj = new ValidParentheses();
    String str = "(}";
    boolean res = obj.isValid(str);
    System.out.println(res);
  }

  public boolean isValid(String s) {
    Stack stk = new Stack();
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      if (sChar == '(' || sChar == '{' || sChar == '[')
        stk.push(sChar);
      else if (stk.isEmpty())
        return false;
      else {
        char ch = (char) stk.peek();
        switch (ch) {
          case '(':
            if (')' != sChar)
              return false;
            break;
          case '{':
            if ('}' != sChar)
              return false;
            break;
          case '[':
            if (']' != sChar)
              return false;
            break;
        }
        stk.pop();
      }
    }
    return stk.isEmpty();
  }
}
