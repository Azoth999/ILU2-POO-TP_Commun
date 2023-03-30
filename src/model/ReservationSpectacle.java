package model;

public class ReservationSpectacle extends Reservation {
	private int numPlace;
	private int numZone;
	
	public ReservationSpectacle(int jour, int mois, int numPlace, int numZone) {
		super(jour, mois);
		this.numPlace = numPlace;
		this.numZone = numZone;
	}
	
	@Override
	public String toString() {
		StringBuilder texte = new StringBuilder();
		texte.append("Le " + jour + "/" + mois);
		texte.append(" : place n°" + numPlace);
		texte.append(" zone n°" + numZone + ".");
		return texte.toString();
	}
}
