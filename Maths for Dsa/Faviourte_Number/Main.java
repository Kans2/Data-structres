Anshuman's Favourite Number
Difficulty: BasicAccuracy: 64.48%Submissions: 21K+Points: 1
You are given an integer input N and you have to find whether it is the sum or the difference of the integer 5. (5+5, 5+5+5, 5-5,5-5-5+5+5…..)

 

Example 1:

Input:
N = 10
Output:
YES
Explanation:
Because 10 can be 
written as a sum of 5+5.
 
public class Main {
    public static void main(String[] args) {
        //X + y = N;  - using only 5; so 5 oda multiples 

    }

    public static String check (int n){
     class Solution {
    static String isValid(Long N) {
        // code here
        if(N % 5 == 0){
            return "YES";
        }else{
            return "NO";
        }
        
    }
}
    }
}
