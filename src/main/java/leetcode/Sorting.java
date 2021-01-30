package leetcode;

public class Sorting {

  public static void main(String[] args) {
    Sorting obj = new Sorting();
    int x[] = {5,3,6,7,8,1};
    int res[] = obj.insertionSort(x);
    for(int k : res)
    System.out.print(k+" ");
  }

  public int[] insertionSort(int[] x){
    for(int i=1;i<x.length; i++) {
      int t = x[i];
      for (int j = i; j > 0 && x[j - 1] > t; j--) {
        x[j] = x[j - 1];
        x[j-1] = t;
      }
    }
    return x;
  }
}