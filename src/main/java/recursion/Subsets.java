package recursion;

import java.util.Stack;

public class Subsets {
    public static void main(String[] args) {
        String ip = "ABC";
        char[] op = new char[ip.length()];
        printSubset(ip.toCharArray(), 0, new Stack());
        printSubset(ip.toCharArray(), 0, op, 0);
    }

    private static void printSubset(char[] in, int i, Stack stack) {
        if (i == in.length) {
            System.out.println(stack);
            return;
        }
        printSubset(in, i + 1, stack);
        stack.push(in[i]);
        printSubset(in, i + 1, stack);
        stack.pop();
    }

    private static void printSubset(char[] in, int i, char[] op, int j) {
        if (i == in.length) {
            System.out.print("{");
            for (int k = 0; k < j; k++) {
                System.out.print(op[k]);
                if (k + 1 < j)
                    System.out.print(", ");
            }
            System.out.println("}");
            return;
        }
        printSubset(in, i + 1, op, j);
        op[j] = in[i];
        printSubset(in, i + 1, op, j + 1);
    }
}
