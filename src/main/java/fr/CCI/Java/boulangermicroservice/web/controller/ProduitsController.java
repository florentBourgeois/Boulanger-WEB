package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.Java.boulangermicroservice.model.Produit;

@RestController
public class ProduitsController {
	
	@GetMapping(value= "/produits")
	public List<Produit> listeDesProduits(){
		
		List<Produit> list = new ArrayList<>();
		list.add(new Produit("Pain", 2, "image.url.com"));
		list.add(new Produit("Tarte", 3, "image.url.com"));		
		return list;
		
	}

}
