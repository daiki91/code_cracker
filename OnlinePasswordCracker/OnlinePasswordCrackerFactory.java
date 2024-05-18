public class OnlinePasswordCrackerFactory {
    public static OnlinePasswordCracker create(String type) {
        if (type.equals("BruteForce")) {
            return new BruteForceOnlinePasswordCracker();
        } else if (type.equals("Dictionary")) {
            return new DictionaryOnlinePasswordCracker();
        }
        return null;
    }
}
