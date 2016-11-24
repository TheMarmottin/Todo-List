import java.util.Date;

public class Tache {

	private String titre; 		//titre de la tâche
	private Date dateDeb;		//date de début
	private Date dateFin;		//échéance de la tache
	private boolean retard;		//si la tâche est en retard ou non
	//private Categorie categor; 	//à renseigner
	
	
	//---------------- Fonctions
	
	public Tache(){} 			//constructeur vide, inutile pour l'instant
	
	public Tache(String tito, Date dateFino) {	
		//constructeur défaut (date de début non renseignée)
		
		this.titre = tito;
		this.dateDeb = new Date();
		this.dateFin = dateFino;
		this.retard = false;
		
	}
	
	public String toString(){
		
		return ("Titre : "+this.titre+"\n"+"Date de début : "+this.dateDeb.toString()+"\n"+"Echéance : "+this.dateFin.toString());
		
	}
	
	
}
