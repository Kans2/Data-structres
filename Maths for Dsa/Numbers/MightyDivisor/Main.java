public class Main{
       

    public static void main(String[] args) {
        
    }


    public static int lcm(int v1 ,){
      
    }

    

    public static int check( int n1, int n2){
       while( n1 > 0 && n2 > 0){

        if( n1 > n2){
            n1 = n1 % n2;
        }else{
            n2 = n2 % n1;
        }
       }

    if (n1 == 0) return n2;
    return n1;
    }

}


class Solution {

    static long minNumber(int X, int Y, int Z, int N) {
        // Find LCM of X, Y, Z
        long ans = lcm(X, Y, Z);

        // Count digits of ans
        int count = 0;
        long temp = ans;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Compare with required digits
        if (count == N) {
            return ans;
        } else {
            return -1;
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
}
