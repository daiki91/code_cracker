public class LocalPasswordCrackerFactory {
    public static LocalPasswordCracker create(String type) {
        if (type.equals("BruteForce")) {
            return new BruteForceLocalPasswordCracker();
        } else if (type.equals("Dictionary")) {
            return new DictionaryLocalPasswordCracker();
        }
        return null;
    }
}

