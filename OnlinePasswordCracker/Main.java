public class Main {
    public static void main(String[] args) {
        // Création d'instances de craqueur de mot de passe en ligne
        OnlinePasswordCracker bruteForceCracker = OnlinePasswordCrackerFactory.create("BruteForce");
        OnlinePasswordCracker dictionaryCracker = OnlinePasswordCrackerFactory.create("Dictionary");

        // Utilisation de bruteForceCracker et dictionaryCracker pour craquer des mots de passe en ligne
        String url = "https://example.com/login";
        String login = "user123";
        
        // Craquer le mot de passe en utilisant la méthode de force brute
        String crackedPassword = bruteForceCracker.crack(url, login);
        if (crackedPassword != null) {
            System.out.println("Mot de passe craqué avec la méthode de force brute : " + crackedPassword);
        } else {
            System.out.println("Aucun mot de passe trouvé avec la méthode de force brute.");
        }
        
        // Ajouter des mots de passe au dictionnaire
        DictionaryOnlinePasswordCracker dictionaryCrackerImpl = (DictionaryOnlinePasswordCracker) dictionaryCracker;
        dictionaryCrackerImpl.addEntry(url, "user123", "password123");
        dictionaryCrackerImpl.addEntry(url, "admin", "admin@123");
        
        // Craquer le mot de passe en utilisant la méthode de dictionnaire
        String dictionaryPassword = dictionaryCracker.crack(url, login);
        if (dictionaryPassword != null) {
            System.out.println("Mot de passe craqué avec la méthode de dictionnaire : " + dictionaryPassword);
        } else {
            System.out.println("Le mot de passe n'a pas été trouvé dans le dictionnaire.");
        }
    }
}
