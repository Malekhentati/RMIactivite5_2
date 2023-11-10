package rmiServer;
import rmiService.BanqueImpl;
import rmiService.IBanque;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {
	public static void main(String[] args) {
		try {
            // Créez ou obtenez un registre RMI (port 1099 par défaut)
            LocateRegistry.createRegistry(1099);

            // Créez une instance de l'objet distant (BanqueImpl)
            IBanque od= new BanqueImpl();
            System.out.println(od.toString());
            
            // Publiez l'objet distant dans le registre RMI avec le nom "BanqueObject"
            Naming.rebind("rmi://localhost:1099/BanqueObject", od);

            System.out.println("Serveur RMI de la banque démarré.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.getMessage());
            e.printStackTrace();}   }  
	}


