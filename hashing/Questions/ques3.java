/*
                            Sum of distinct elements 
Basic                Accuracy: 65.64%            Submissions: 2211              Points: 1


You are given an array Arr of size N. Find the sum of distinct elements in an array.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So sum is 15.
Example 2:

Input:
N = 5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So sum is 5.
Your Task:
You don't need to read input or print anything.
Your task is to complete the function findSum() which takes
the array of integers arr and n as parameters and returns an integer denoting the answer.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N*logN)

Constraints:
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 103
*/





// { Driver Code Starts
//Initial Template for Java





import java.util.*;
import java.io.*;

public class ques3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    int findSum(int arr[], int n) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int sum=0;
        for(Integer i: hs){
            sum+=i;
        }
        return sum;
    }
}
