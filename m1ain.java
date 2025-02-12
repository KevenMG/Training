import java.util.Scanner;

public class m1ain {
    public static void main(String[] args) {

        int age = 24;
        double prix = 5.99;
        boolean estVrai = true;
        String nom = "Keven";

        // Affichage des informations 5 fois avec la boucle for
        for (int i = 1; i <= 2; i++) {
            System.out.println("Nom : " + nom);
            System.out.println("Age : " + age);
            System.out.println("Prix : " + prix);
            System.out.println("Est-ce vrai ? : " + estVrai);
        }

        // Création du scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;

        // Boucle while pour demander un âge supérieur ou égal à 18
        while (nombre < 18) {
            System.out.println("Entrez votre âge :");
            nombre = scanner.nextInt();  // Lire l'entrée de l'utilisateur

            if (nombre < 18) {
                System.out.println("Interdit aux mineurs");
            }
        }

        // Fermeture du scanner
        scanner.close();

        // Vérification si l'âge est supérieur ou égal à 18
        if (nombre >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("/!\\ Vous êtes mineur.");
        }
    }
}
