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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO;
import fr.CCI.Java.boulangermicroservice.model.Produit;

@RestController
public class ProduitsController {
	
	ProduitDAO produitDao = new ProduitDAO();
	
	@GetMapping(value= "/produits")
	public List<Produit> listeDesProduits(){
		return produitDao.getProduits();
	}
	
	@GetMapping(value= "/produits/{id}")
	public Produit produitParID(@PathVariable int id) {
		return produitDao.getByID(id);
	}
	
	
	@PostMapping(value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit){
		produitDao.addProduit(produit);
	}
	
	
	
	
	
	/*
    @PostMapping (value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit){
    	produitDao.addProduit(produit);

        //return new ResponseEntity<Commande>(commande, HttpStatus.CREATED);
    }
    
    */

}
