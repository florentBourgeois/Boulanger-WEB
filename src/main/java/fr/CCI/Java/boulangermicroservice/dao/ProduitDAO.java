package fr.CCI.Java.boulangermicroservice.dao;

import java.util.ArrayList;
import java.util.List;

import fr.CCI.Java.boulangermicroservice.model.Produit;

public class ProduitDAO {

	List<Produit> produits = new ArrayList<>();
	
	public ProduitDAO() {
		this.produits.add(new  Produit(0, "pain", 2, "url"));
		this.produits.add(new  Produit(1, "tarte", 1, "url"));
		this.produits.add(new  Produit(2, "paris brest", 5, "url"));
	}
	
	
	
	public void addProduit(Produit p ) {
		this.produits.add(p);
	}

	public List<Produit> getProduits() {
		return produits;
	}
	

	public Produit getByID(int id) {
		for (Produit produit : produits) {
			if(produit.getId() == id)
				return produit;
		}
		return null;
	}
	
	
	
}
