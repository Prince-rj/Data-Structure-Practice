    package questions;
// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                String s = sc.next();
                Solution obj = new Solution();
                System.out.println(obj.reverseWords(s));
                t--;
            }
        }
    }
    // } Driver Code Ends
    
    
    
    
    class Solution 
    {
        //Function to reverse words in a given string.
        String reverseWords(String S)
        {
            // code here 
            Stack<String> st=new Stack<>();
            int count=0;
            String word="";
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)!='.'){
                    word+=Character.toString(S.charAt(i));
                }
                else{
                    st.push(word);
                    word="";
                }
            }
            // for(int i=0;i<splited.length;i++){
            // System.out.println(splited);
            // }
            String ans="";
            int n=st.size();
            for(int i=0;i<n;i++){
                ans=ans+st.pop();
                ans+=".";
            }
            return ans;
            
        }
    }
