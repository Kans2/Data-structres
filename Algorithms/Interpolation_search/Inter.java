//improves over binary Search best used for uniformly Distributed data where a value might be based 
//calculated probe results if is incrt ,search area is narrowed new prob
//average case - ologn
//worst case on

public  class Inter{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};

        int index = inter(arr, 7);


       

        if(index != -1){
            System.out.println("The element is found at index:" + index);
        }else{
            System.out.println("Element is not found");
        }
    }


    public static int inter(int [] arr,int value){
              
        int low = 0;
        int high = arr.length - 1;
        while( low <= high && value <= arr[high] && value >= arr[low]){

            if(arr[high] == arr[low]){
                if(arr[low] == value){
                    return  value;

                }else{
                    return  -1;
                }
            }

            int prob = low + ((value - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if(arr[prob] == value){
                return  prob;
            }else if(value > arr[prob]){
                low = prob + 1;
            }else{
                high = prob - 1;
            }

        }

        return  -1;
    }
}