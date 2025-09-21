import java.util.ArrayList;

public class Sample {

    public static void main(String[] args) {
        int N = 20;
        System.out.println(result(N));
    }
 
    public static boolean isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num <= 1) return false;
            if(num % i == 0){
                return false;
            } 
        }
        return true;
    }

    public static ArrayList<Integer> result (int N){
        
        ArrayList <Integer> list = new ArrayList<Integer>();

        for(int i = 2; i <= N; i++){
            if(N % i == 0 && isPrime(i)){
                     list.add(i);
            }
        }

        return list;
    }
}
