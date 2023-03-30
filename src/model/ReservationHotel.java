package model;

public class ReservationHotel extends Reservation {
	private int nbLitSimple;
	private int nbLitDouble;
	private int chambre;
	
	public ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int chambre) {
		super(jour, mois);
		this.nbLitDouble = nbLitsDoubles;
		this.nbLitSimple = nbLitsSimples;
		this.chambre = chambre;
	}
	
	@Override
	public String toString() {
		StringBuilder texte = new StringBuilder();
		texte.append("Le " + jour + "/" + mois);
		texte.append(" : chambre n°" + chambre);
		texte.append(" avec " + nbLitSimple + " lits simples et " 
				+ nbLitDouble + " lits doubles.");
		return texte.toString();
	}
}
