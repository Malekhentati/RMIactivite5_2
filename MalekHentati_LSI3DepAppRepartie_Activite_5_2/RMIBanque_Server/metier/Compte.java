package metier;
import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable{
	private int code;
    private double solde;
    private String dateCreation;

 // Constructeur
    public Compte(int code, double solde, String dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    
    public int getCode() {return code;}
    public void setCode(int code) { this.code = code;}
    
    public double getSolde() { return solde;}
    public void setSolde(double solde) {this.solde = solde;}
   
    public String getDateCreation() {return dateCreation;}
    public void setDateCreation(String dateCreation) {this.dateCreation = dateCreation;}
          
}

