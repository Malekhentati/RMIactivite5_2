package rmiService;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    private Map<Integer, Compte> comptes;

    public BanqueImpl() throws RemoteException {
        comptes = new HashMap<>();
    }
    @Override
    public String creerCompte(Compte c) throws RemoteException {
        comptes.put(c.getCode(), c);
        return "Compte créé avec succès.";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        Compte compte = comptes.get(code);
        if (compte != null) {
            return "Code: " + compte.getCode() + ", Solde: " + compte.getSolde() + ", Date de création: " + compte.getDateCreation();
        } else {return "Compte introuvable.";}
    }}       
