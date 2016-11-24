import java.util.Date;

public class Tache {

	private String titre; 		//titre de la t�che
	private Date dateDeb;		//date de d�but
	private Date dateFin;		//�ch�ance de la tache
	private boolean retard;		//si la t�che est en retard ou non
	//private Categorie categor; 	//� renseigner
	
	
	//---------------- Fonctions
	
	public Tache(){} 			//constructeur vide, inutile pour l'instant
	
	public Tache(String tito, Date dateFino) {	
		//constructeur d�faut (date de d�but non renseign�e)
		
		this.titre = tito;
		this.dateDeb = new Date();
		this.dateFin = dateFino;
		this.retard = false;
		
	}
	
	public String toString(){
		
		return ("Titre : "+this.titre+"\n"+"Date de d�but : "+this.dateDeb.toString()+"\n"+"Ech�ance : "+this.dateFin.toString());
		
	}
	
	
}
