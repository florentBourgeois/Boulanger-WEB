package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
