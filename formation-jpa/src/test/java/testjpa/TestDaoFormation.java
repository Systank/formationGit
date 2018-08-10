package testjpa;

import formation.dao.IDaoFormation;
import formation.dao.jpa.DaoFormationJPA;
import sopra.promo404.formation.model.Formation;
import sopra.promo404.formation.model.FormationId;

public class TestDaoFormation {
	public static void main(String[] args) {
		IDaoFormation daoFormation = new DaoFormationJPA();

		Formation fleuriste = new Formation();
		fleuriste.setId(new FormationId("Interflora", "2018"));
		fleuriste.setDuree(80);
		daoFormation.save(fleuriste);

		// daoFormation.findById(1L);

		// daoFormation.delete(fleuriste);//
	}
}