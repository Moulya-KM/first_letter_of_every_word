{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String fnl="";
        String gg[]=S.split(" ");
        for(int i=0;i<gg.length;i++)
        {
            char c=gg[i].charAt(0);
            fnl=fnl+Character.toString(c);
        }
        
        return fnl;
    }
};