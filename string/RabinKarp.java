//in rabin-karp algorithm we make a hash function and then compare the string 
//of the m words ie pat with the hash function of the string with the first m
// letters of the bigger string to which we have to find the answer and then if the 
// hash functions match then only we move to do one by one comparisons otherwise we
//do not do so the worst case for it is still |s|*m but average case senario is less


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}// } Driver Code Ends


//User function Template for Java
//a b c=hash=0;m==3
//hash=1
//hash=1*10+2
//hash=12*10+3;
//hash=123;
//bcd
//hash=123-1*10^2
class Solution
{
    public int HashFunction(String s){
        int hash=0;
        for(int i=0;i<s.length();i++){
            hash=hash*31+s.charAt(i);
        }
        return hash;
    }
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        int m=pat.length();
        ArrayList<Integer> arr=new ArrayList<>();
         
        int hashPat=HashFunction(pat);
        String word="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<pat.length();i++){
            sb.append(S.charAt(i));
        }
        word=sb.toString();
        int hashWord=HashFunction(word);
        for(int i=0;i<=S.length()-m;){
            if(hashWord==hashPat){
                int j;
                for(j=0;j<pat.length();j++){
                    if(S.charAt(i+j)!=pat.charAt(j)){
                        break;
                    }
                }
                    if(j==m){
                        arr.add(i+1);
                    }
            }
            if(i+m<S.length()){
            hashWord=((hashWord-(S.charAt(i)*(int)Math.pow(31,m-1)))*31)+S.charAt(i+m);
            }
            System.out.println(hashWord);
            i++;
        }
        if(arr.isEmpty()){
            arr.add(-1);
        }
        return arr;
    }
}