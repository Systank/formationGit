package testjpa.dao;

import java.text.SimpleDateFormat;

import formation.dao.IDaoOrdinateur;
import formation.dao.jpa.DaoOrdinateurJPA;
import sopra.promo404.formation.model.Ordinateur;

public class TestDaoOrdinateur {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		IDaoOrdinateur daoOrdinateur = new DaoOrdinateurJPA();
		Ordinateur ajc130 = null;
		
		ajc130 = new Ordinateur("ajc130", 16,true);
		
		daoOrdinateur.save(ajc130);
	}

}
