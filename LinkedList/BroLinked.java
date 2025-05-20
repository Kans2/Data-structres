
import java.util.LinkedList;

public class BroLinked {
    public static void main(String[] args) {
        LinkedList <String> Playlist = new LinkedList<String>();

        Playlist.offer("New Marron song");
        Playlist.offer("Cupid");
        Playlist.offer("Dragon");

        Playlist.add(2, "Avatar");

      
        
        Playlist.addFirst("Mood");
        Playlist.addLast("Sunflower");
      
        System.out.println(Playlist.peekFirst());
        
        System.out.println(Playlist.peekLast());

        System.out.println(Playlist);
    }
}
