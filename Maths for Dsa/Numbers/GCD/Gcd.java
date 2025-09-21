public class Gcd {
    //Euclidian Algorithm - gcd(a,b) = gcd(a-b,b);

    public static void main(String[] args) {
     System.out.println(gcd(20, 40));
    }


    public static int  gcd(int N1, int N2){
       while(N1 > 0 && N2 > 0){

        if( N1 > N2){
            N1= N1 % N2;
        }else{
            N2 = N2 % N1; // 0
        }
       }

       if N1 == 0 return N2;

       return N1;
    }
}
