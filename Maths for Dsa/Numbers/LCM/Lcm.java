
import java.util.ArrayList;

public class Lcm {

    //efficiant approach
    //LCM(a,b)=a×b​ /gcd(a,b)

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(lcm(a, b));
    }
    
    public static int lcm(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1; i <= a; i++){
           int multiples = a * i;
           list.add(multiples);
        }

        for(int j = 1; j <= b; j++){
            int multiples = b * j;
            list2.add(multiples);
        }

          // find first common multiple
        for (int x : list) {
            if (list2.contains(x)) {
                return x;  // first common multiple is LCM
            }
        }

      return -1;
    }
}
