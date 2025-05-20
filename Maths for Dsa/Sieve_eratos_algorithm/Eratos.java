
public class Eratos {
    //[N+1] and true boolean 
    //value all set to true
    //precomputing add false to the non prime 
    //return overall 
    //optimize overall complexity
    public static void main(String[] args) {
    

           int N = 1000;

           System.out.println(eratos(N));
    }

    public static int  eratos (int N){
            
        boolean [] seive = new boolean[N + 1];

        int count = 0;

        for(int i=0; i<= N; i++){
            seive[i] = true;
        }

        for(int i=2; i * i <= N; i++){
             if(seive[i]){
                for(int mul = i * i; mul<=N; mul+= i){
                     seive[mul] = false;
                }
             }
        }


        for(int i=2; i< N; i++){
            if(seive[i]){
                System.out.println("the prime number are " + i);
                count++;
            }
        }

        return count;
    }

  
}
