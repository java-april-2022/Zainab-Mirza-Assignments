
import java.util.HashMap; 
import java.util.Set; 

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>(); 
        trackList.put("Baby", "And I was like baby, baby, baby, oohhhh");
        trackList.put("Thinkin Bout You", "A tornado flew around my room before you came");
        trackList.put("Self Control", "Pause the convo, about your summer last night.");
        trackList.put("White Ferrari", "Bad luck to talk");
        String track = trackList.get("Thinkin Bout You"); 
        System.out.println(track); 

        Set <String> keys = trackList.keySet(); 
        for(String key : keys){
            System.out.printf("%s: %s\n", key, trackList.get(key));
        }
    }
}
