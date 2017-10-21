package co.simplon.Entrainement;


public class Personne {
	private int age;
	private double taille;
	private String couleurCheveux;
	private static String nom;
	private boolean vivant;
	
	
	
	public Personne(int age, double taille, String couleurCheveux, String nom, boolean vivant) { //constructeur avec tous les arguments
		super();
		this.age = age;
		this.taille = taille;
		this.couleurCheveux = couleurCheveux;
		this.nom = nom;
		this.vivant = true;
		
	}

	@Override
	public String toString() {
		return "Personne [age=" + age + ", taille=" + taille + ", couleurCheveux=" + couleurCheveux + ", nom=" + nom
				+ ", vivant=" + vivant + "]";
	}

	
	 public void veillir(int annee) {
		 this.age += annee;
		 if ( this.age >= 100) {
			 this.mourrir();
		 }
	 }
	 public void mourrir() {
		 this.vivant = false;
	 }

	public static String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}
	
	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}
	
	public static String getCouleurCheveux(String couleurCheveux) {
		return couleurCheveux;
	}

}

