package fr.CCI.Java.boulangermicroservice.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Produit {
	
	@Id
	@GeneratedValue
	private int id; 
	private String nom;
	private int valeur;
	private String img;
	
	
	public Produit() {
	}
	
	
	public Produit(int id,String nom, int valeur, String img) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.img = img;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return id+ " " + nom + " vendu à " + valeur + " euro";
	}
	
	

	
}
