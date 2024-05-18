import java.util.HashMap;
import java.util.Map;

public class DictionaryLocalPasswordCracker implements LocalPasswordCracker {
    private Map<String, String> dictionary = new HashMap<>();

    public void addWord(String word, String hash) {
        dictionary.put(hash, word);
    }

    @Override
    public String crack(String hash) {
        return dictionary.get(hash);
    }
}
