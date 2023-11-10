package rmiClient;
import java.rmi.Naming;
import java.util.Scanner;
import rmiService.IBanque;
import metier.Compte;
import java.util.Date;
public class BanqueClient {
    public static void main(String[] args) {
	 try {
         // Recherche l'objet distant en utilisant l'URL RMI
         IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1099/BanqueObject");

         // Création d'un scanner pour lire l'entrée de l'utilisateur
         Scanner scanner = new Scanner(System.in);

         // Création d'un compte Appel de la méthode creerCompte pour créer un compte
         Compte compte = new Compte(1, 1000.0, "01/01/2023");
         String messageCreation = stub.creerCompte(compte);
         System.out.println(messageCreation);

         // Saisir le code du compte et Appeler de la méthode getInfoCompte pour obtenir des informations sur le compte
         System.out.println("Veuillez entrer le code du compte pour obtenir des informations : ");
         int codeCompte = scanner.nextInt();
         String infoCompte = stub.getInfoCompte(codeCompte);
         System.out.println(infoCompte);
     } catch (Exception e) {
         System.err.println("Erreur du serveur : " + e.getMessage());
         e.printStackTrace();}}}
     

