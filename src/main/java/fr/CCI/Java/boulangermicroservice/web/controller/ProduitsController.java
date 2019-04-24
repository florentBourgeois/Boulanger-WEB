package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO;
import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO_Old;
import fr.CCI.Java.boulangermicroservice.model.Produit;

@RestController
public class ProduitsController {
	
	@Autowired
	private ProduitDAO produitDao;
	
	@GetMapping(value= "/produits")
	public List<Produit> listeDesProduits(){
		return produitDao.findAll();
	}
	
	@GetMapping(value= "/produits/{id}")
	public Produit produitParID(@PathVariable int id) {
		return produitDao.findById(id);
	}

	/*
	@PostMapping(value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit){
		produitDao.addProduit(produit);
	}
	
	
	@PutMapping(value = "/produits/{id}")
	public void updateProduit(@PathVariable int id, @RequestBody Produit p) {
		produitDao.update(id, p);
	}
	
	
	
	
	
    
    */

}
