package rmiService;
import java.rmi.Remote;
import java.rmi.RemoteException;
import metier.Compte;

public interface IBanque extends Remote{
	 public String creerCompte(Compte c)throws RemoteException;
	 public String getInfoCompte(int code)throws RemoteException;}
	

