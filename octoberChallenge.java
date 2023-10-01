package StriverssdeSheet;

import java.util.Stack;

public class octoberChallenge {
    //oct 1st
     public static String reverseWords(String s) {
      char[] c = s.toCharArray();
      int n = s.length();
      int i,j;
      for(i=0, j=0;j<n;j++){
        if(c[j]==' '){
            reverse(c,i,j-1);
            i = j+1;
        }
      }
      reverse(c,i,n-1);
      return new String(c);
    }
    public static void reverse(char c[],int i,int j){
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;j--;
        }
        
    }
    public static void main(String[] args){
        String s = "god ding";
        System.out.println(reverseWords(s));
    }
}
