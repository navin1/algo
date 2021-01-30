package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class WordLadder {
  public static void main(String[] args) {
    WordLadder obj = new WordLadder();
    List<String> lst = new ArrayList<String>();
    String beginWord = "hot", endWord = "dog";
    String[] wordList = {"hot","cog","dog","tot","hog","hop","pot","dot"};
    lst = Arrays.asList(wordList);
    int res = obj.ladderLength(beginWord,endWord,lst);
    System.out.println(res);
  }

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    if(!wordList.contains(endWord))
      return 0;
    ListIterator<String> litr = wordList.listIterator();
    int count = 0;
    while(litr.hasNext()){
      String newWord = litr.next();
      int changeCount =0;
      int changeCount1 = 0;
      if(newWord == beginWord){
        count++;
      }
      for(int i=0; i<newWord.length(); i++){
        if(beginWord.charAt(i)!=newWord.charAt(i)){
          changeCount++;
        }
        if(newWord.charAt(i)!=endWord.charAt(i)) {
          changeCount1++;
        }
      }
      if(changeCount==1){
        count++;
        changeCount = 0;
        beginWord = newWord;
        System.out.println(beginWord);
      }
      if(changeCount1!=0) {
        if(changeCount1==1) {
          count++;
          System.out.println(endWord);
          break;
        }
        changeCount1 = 0;
      }
    }
    if(count>0){
      count++;
    }
    return count;
  }
}
  