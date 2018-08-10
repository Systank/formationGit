package sopra.promo404.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="subject")
public class Matiere {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String nom;
	@Column(name="duration")
	private int duree;
	
	@Column(name="difficulty")
	private Difficulte difficulte;
	@ManyToMany(mappedBy="trainer")
	private List<Formateur> formateurs = new ArrayList<>();

	
	public Matiere() {
		super();
	}

		public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public Difficulte getDifficulte() {
		return difficulte;
	}


	public void setDifficulte(Difficulte difficulte) {
		this.difficulte = difficulte;
	}


	public List<Formateur> getFormateurs() {
		return formateurs;
	}


	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
	
}