package sopra.promo404.formation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUD")
public class Eleve extends Personne {
	@Column(name="civility")
	private Civilite civilite;
	@Column(name="birthday")
	private Date dtNaissance;
	@Column(name="provider")
	private Formateur formateur;
	@Column(name="computer")
	private Ordinateur ordinateur;

	public Eleve() {
		super();
	}

	public Eleve(Civilite civilite, String nom, String prenom, Date dtNaissance) {
		super(nom, prenom);
		this.civilite = civilite;
		this.dtNaissance = dtNaissance;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}

}
