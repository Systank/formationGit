package testjpa;

import formation.dao.IDaoMatiere;
import formation.dao.jpa.DaoMatiereJPA;
import sopra.promo404.formation.model.Difficulte;
import sopra.promo404.formation.model.Matiere;

public class TestDaoMatiere {
	public static void main(String[] args) {
		IDaoMatiere daoMatiere = new DaoMatiereJPA();
		
		Matiere fleur = new Matiere(Difficulte.IMPOSSIBLE, "85","fleurs" );
		daoMatiere.save(fleur);
		
		
		

	}
}



