package fr.CCI.Java.boulangermicroservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.CCI.Java.boulangermicroservice.model.Produit;

@Repository
public interface ProduitDAO extends JpaRepository<Produit, Integer>{

	
	Produit findById(int id);
	Produit findByNom(String nom);
	List<Produit> findByValeurGreaterThan(int valeur);
	
	
}
