public class BinaryTree{

      Node root;

      BinaryTree(){
         
         this.root = null;
      }




      //Insertin the values method

//data root nodela insert pananum 
     public  void Insert(int data){
           

           root = insertRec(root,data);
     }


///Left and right root nodela inserts
     //Recursive method
     private static void insertRec(Node root,int data){
  

  //null iruntha return root node
        if(root == null){

            root = new Node(data);

            return root;
        }

        if(data < root.data){
            root.Left = insertRec(root.Left,data);
        }else if(data > root.data){
            root.Right = insertRec(root.Right,data)
        }


       return root;


     }
      public static void preOrder(Node root) {
        
        if(root == null){
            return;
        }
        
         System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);

    }

     public static void postOrder(Node root) {
        
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

     public static void inOrder(Node root) {
        
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }



}