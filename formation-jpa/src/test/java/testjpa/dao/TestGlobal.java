package testjpa.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import formation.dao.IDaoOrdinateur;
import formation.dao.IDaoPersonne;
import formation.dao.jpa.DaoOrdinateurJPA;
import formation.dao.jpa.DaoPersonneJPA;
import sopra.promo404.formation.model.Adresse;
import sopra.promo404.formation.model.Civilite;
import sopra.promo404.formation.model.Eleve;
import sopra.promo404.formation.model.Ordinateur;
import sopra.promo404.formation.model.Personne;

public class TestGlobal {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		IDaoPersonne daoPersonne = new DaoPersonneJPA();
		IDaoOrdinateur daoOrdinateur = new DaoOrdinateurJPA();
		Personne premier = null;
		Adresse adresse1 = null;

		try {
			premier = new Eleve(Civilite.M, "CRAPPEEL", "Lucas", sdf.parse("16/07/1994"));
			adresse1 = new Adresse("91 Avenue de Saint Médard", "33320", "Eysines", "France");
			premier.setAdresse(adresse1);
			
			daoPersonne.save(premier);

			Ordinateur ajc130 = null;

			ajc130 = new Ordinateur("ajc130", 16, true);
			ajc130.setEleve((Eleve) premier);
			daoOrdinateur.save(ajc130);

			

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
