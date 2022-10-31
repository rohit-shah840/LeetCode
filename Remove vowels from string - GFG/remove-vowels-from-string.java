//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
        // code here
        Set<Character> vowel = Set.of('a','e','i','o','u');
        char [] chars = S.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(char c : chars){
            if(!vowel.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}