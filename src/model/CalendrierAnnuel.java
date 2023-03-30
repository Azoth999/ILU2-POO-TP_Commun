package model;

public class CalendrierAnnuel {
	private Mois[] mois;
	
	public CalendrierAnnuel() {
		this.mois = new Mois[12];
		this.mois[0] = new Mois("Janvier",31);
		this.mois[1] = new Mois("Fevrier", 28);
		this.mois[2] = new Mois("Mars", 31);
		this.mois[3] = new Mois("Avril",30);
		this.mois[4] = new Mois("Mai", 31);
		this.mois[5] = new Mois("Juin", 30);
		this.mois[6] = new Mois("Juillet", 31);
		this.mois[7] = new Mois("Août", 31);
		this.mois[8] = new Mois("Septembre", 30);
		this.mois[9] = new Mois("Octobre", 31);
		this.mois[10] = new Mois ("Novembre", 30);
		this.mois[11] = new Mois("Decembre", 31);
		
	}
	
	private class Mois{
		private String nom;
		private boolean[] jours;
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		private void reserver(int jour) throws IllegalStateException {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Erreur, ce jour est déjà réservé.");
			}
			jours[jour-1]= true;
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return this.mois[mois-1].estLibre(jour);	
	}
	
	public boolean reserver(int jour, int mois) {
		if(estLibre(jour, mois)) {
			this.mois[mois-1].reserver(jour);
			return true;
		}else {
			return false;
		}
	}
	
}
