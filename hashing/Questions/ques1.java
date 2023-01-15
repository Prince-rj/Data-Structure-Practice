/*
                              Non Repeating Character 
Easy            Accuracy: 49.1%         Submissions: 53808          Points: 2


Given a string S consisting of lowercase Latin Letters. Find the first non-repeating
character in S.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 103 

*/



//SOLUTION

// { Driver Code Starts
//Initial Template for Java

package Questions;
import java.io.*;
import java.lang.*;
import java.util.*;


class ques1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++){
            if(h.containsKey(S.charAt(i))){
                h.put(S.charAt(i),h.get(S.charAt(i))+1);
            }
            else{
                h.put(S.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> e:h.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return '$';
    }
}
