package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
Problem:
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words such that:
The first word in the sequence is beginWord.
The last word in the sequence is endWord.
Only one letter is different between each adjacent pair of words in the sequence.
Every word in the sequence is in wordList.
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
*/

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
  