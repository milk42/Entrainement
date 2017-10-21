package co.simplon.Entrainement;


public class Wilfried {
	

		public static void main(String[] args) {
			
			Personne Wilfried = new Personne (49,170,"brun","Wilfried", true);
			System.out.println(Wilfried.toString());
			Wilfried.veillir(60);
			System.out.println(Wilfried.toString());
			System.out.println(Personne.getNom());
			System.out.println("Ses cheveux sont devenus " + Personne.getCouleurCheveux("verts"));
			

		

	}

}
