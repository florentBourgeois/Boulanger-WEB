package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO;
import fr.CCI.Java.boulangermicroservice.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO_Old;
import fr.CCI.Java.boulangermicroservice.model.Produit_Old;

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
	@GetMapping(value= "/produits/plusCherQue/{val}")
	public List<Produit> produitPlusCherQue(@PathVariable int val) {
		return produitDao.findByValeurGreaterThan(val);
	}
	@GetMapping(value= "/produits/parNom/{nom}")
	public Produit produitParNom(@PathVariable String nom) {
		return produitDao.findByNom(nom);
	}
	@PostMapping(value = "/produits")
	public void ajouterProduit(@RequestBody Produit produit){
		produitDao.save(produit);
	}
	@PutMapping(value = "/produits/{id}")
	public void updateProduit(@PathVariable int id, @RequestBody Produit p) {
		Produit prod =produitDao.getOne(id);
		prod.setNom(p.getNom());
		prod.setValeur(p.getValeur());
		prod.setImg(p.getImg());
		produitDao.save(prod);
	}
	/*
	@GetMapping(value= "/produits/{id}")
	public Produit produitParID(@PathVariable int id) {
		return produitDao.getByID(id);
	}

	
	@PostMapping(value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit){
		produitDao.addProduit(produit);
	}
	
	
	@PutMapping(value = "/produits/{id}")
	public void updateProduit(@PathVariable int id, @RequestBody Produit p) {
		produitDao.update(id, p);
	}
	
	*/
	
	
	/*
    @PostMapping (value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit){
    	produitDao.addProduit(produit);

        //return new ResponseEntity<Commande>(commande, HttpStatus.CREATED);
    }
    
    */

}
