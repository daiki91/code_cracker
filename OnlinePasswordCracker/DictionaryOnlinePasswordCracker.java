import java.util.HashMap;
import java.util.Map;

class DictionaryOnlinePasswordCracker implements OnlinePasswordCracker {
    private Map<String, String> dictionary = new HashMap<>();

    public void addEntry(String url, String login, String password) {
        String key = url + "/" + login;
        dictionary.put(key, password);
    }

    @Override
    public String crack(String url, String login) {
        String key = url + "/" + login;
        return dictionary.get(key);
    }
}
