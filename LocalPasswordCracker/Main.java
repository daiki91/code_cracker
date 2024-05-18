public class Main {
    public static void main(String[] args) {
        // Création d'instances de craqueur de mot de passe
        LocalPasswordCracker bruteForceCracker = LocalPasswordCrackerFactory.create("BruteForce");
        LocalPasswordCracker dictionaryCracker = LocalPasswordCrackerFactory.create("Dictionary");

        // Utilisation de bruteForceCracker et dictionaryCracker pour craquer des mots de passe
        String hashToCrack = "e10adc3949ba59abbe56e057f20f883e"; // Le hash pour "MotDePasse123" (MD5)
        
        // Craquer le hash en utilisant la méthode de force brute
        String crackedPassword = bruteForceCracker.crack(hashToCrack);
        System.out.println("Mot de passe craqué avec la méthode de force brute : " + crackedPassword);
        
        // Craquer le hash en utilisant la méthode de dictionnaire
        String dictionaryPassword = dictionaryCracker.crack(hashToCrack);
        if (dictionaryPassword != null) {
            System.out.println("Mot de passe craqué avec la méthode de dictionnaire : " + dictionaryPassword);
        } else {
            System.out.println("Le mot de passe n'a pas été trouvé dans le dictionnaire.");
        }
    }
}
