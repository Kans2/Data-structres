// User function Template for Java
class Solution {
    static String isSumOfTwo(int N) {
       int count = 0;
       int sum = 0;
       //first array create pananmum
       boolean [] sieve = new boolean[N + 1]; //full size
       
       for(int i = 0; i <= N; i++){
           sieve[i] = true;
       }
       
       
       for(int i= 2; i * i <=N; i++){
           if(sieve[i]){
                for(int mul = i * i ; mul <= N;  mul+=i){
                    sieve[mul] = false;
                } 
           }
         
       }
       
       
        // Iterate through all possible pairs of primes
        for (int p1 = 2; p1 <= N / 2; p1++) {
            if (sieve[p1]) {
                int p2 = N - p1;
                if (sieve[p2]) { 
                    return "Yes";
                }
            }
        }
       
       
       
       return "No";
       
     
}
}
