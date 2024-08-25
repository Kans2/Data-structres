public class TrieNode {
    
    TrieNode [] Letters = new TrieNode[26];

    Boolean isEndofword;
    

   public TrieNode(){
    isEndofword = false;
    for(int i=0; i<26; i++){
        Letters[i] = null;
    }
          
    }

}
