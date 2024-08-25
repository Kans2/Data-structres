
public class Trie {
     
    //root 
    private TrieNode root;


    //childrens
    public Trie(){
        root = new TrieNode();   //new node start
    }
    
    //method to insert
    public   void insert(String word){
      TrieNode node = root;     //instance of the Trirnode

      for(int i =0; i< word.length(); i++){
             int index = word.charAt(i)-'a';
             if (node.Letters[index]== null){
                 node.Letters[index] = new TrieNode();

             }

             node = node.Letters[index];
           
      }

      node.isEndofword = true;

    }
    //Search method use boolean
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.Letters[index] == null) {
                return false;
            }
            node = node.Letters[index];
        }
        return node != null && node.isEndofword;
    }
     // Method to check if any word in the Trie starts with the given prefix
     public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.Letters[index] == null) {
                return false;
            }
            node = node.Letters[index];
        }
        return true;
    }

}
