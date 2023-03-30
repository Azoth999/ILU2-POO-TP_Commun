package model;

public class ReservationRestaurant extends Reservation {
	private int service;
	private int table;
	
	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour, mois);
		this.service = service;
		this.table = table;
	}
	
	@Override
	public String toString() {
		StringBuilder texte = new StringBuilder();
		texte.append("Le " + jour + "/" + mois);
		texte.append(" : table n°" + table);
		if(service==1) {
			texte.append(" pour le premier service.\n");
		}else {
			texte.append(" pour le deuxième service.\n");
		}
		return texte.toString();
	}
}
