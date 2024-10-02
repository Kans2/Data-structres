import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    /* 
    public static void main(String [] args){
        HashMap <String,Integer> group1 = new HashMap<>();

        group1.put("Alice",100);
        group1.put("Bob",99);
        group1.put("doe",98);
        group1.put("tae",97);

       String [] group2= {"Alice","ram","joe","remo"};


       for(String s : group2){
        if(group1.containsKey(s)){
            System.out.println(s+" "+" this student is both groups" );
        }else{
            System.out.println(s + "this person is only in group2");

        }
       }

    }  */
   
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] result = findRestaurant(list1, list2); 

        for(String s : result) {
            System.out.println(s);
        }
    }
   
    public  static String[] findRestaurant (String[] list1, String[] list2) {

        HashMap <String,Integer> map = new HashMap<>();

        for(int i=0; i<list1.length; i++){

            map.put(list1[i],i);

        }

        ArrayList<String> common = new ArrayList<>();
        int minindexsum = Integer.MAX_VALUE;

        for(int j=0; j<list2.length; j++){
            String k = list2[j];

            if(map.containsKey(k)){
                int index = map.get(k);
                int sumIndex = index + j;

                if(sumIndex < minindexsum){
                    common.clear();
                    common.add(k);


                }else if(sumIndex == minindexsum){
                       common.add(k);
                }

                
            }
            


        }

        
   
     
        return common.toArray(new String[0]);

    }

    


}





//