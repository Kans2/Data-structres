
public class Main {
public static void main(String[] args) {
    
    Trie trie = new Trie();

    trie.insert("apple");
    trie.insert("app");

    System.out.println(trie.search("app"));
    System.out.println(trie.startsWith("apple"));

}

}
