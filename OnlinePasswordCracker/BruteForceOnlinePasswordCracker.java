class BruteForceOnlinePasswordCracker implements OnlinePasswordCracker {
    @Override
    public String crack(String url, String login) {
        // Implémentation de la méthode de force brute en ligne
        String[] commonPasswords = {"password", "123456", "qwerty", "abc123"}; // Liste de mots de passe
        
        for (String password : commonPasswords) {
            if (isValidPassword(url, login, password)) {
                return password;
            }
        }
        
        return null; // Aucun mot de passe trouvé
    }

    private boolean isValidPassword(String url, String login, String password) {
        // Implémentation simplifiée pour vérifier si le mot de passe est valide
        return true; // Toujours considéré comme valide pour cet exemple
    }
}

