
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <String> q = new LinkedList<>();

        System.out.println("the que is:"+ q.peek());

        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");

        q.poll();
        System.out.println("the first element is:" + q.peek() );

        System.out.println("the size is:"+ q.size());


    }
    
}
