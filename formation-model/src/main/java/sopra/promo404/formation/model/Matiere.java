package sopra.promo404.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="subject")
public class Matiere {
	@Id
	@GeneratedValue
	@Column(name="SUBJ_ID")
	private Long id;
	@Column(name="name")
	private String nom;
	@Column(name="duration")
	private int duree;
	
	@Column(name="difficulty")
	private Difficulte difficulte;
	@ManyToMany
	@JoinTable(	name = "trainer_subject", 	
	joinColumns = @JoinColumn(name = "subject_id"), 
	inverseJoinColumns = @JoinColumn(name = "trainer_id"), 
	uniqueConstraints = @UniqueConstraint(columnNames = { "subject_id", "trainer_id" }))
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