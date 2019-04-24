package fr.CCI.Java.boulangermicroservice.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.CCI.Java.boulangermicroservice.dao.ProduitDAO;
import fr.CCI.Java.boulangermicroservice.model.Produit;

@Controller
public class VueHTMLController {

	@Autowired
	private ProduitDAO produitDao;
	
	@GetMapping(value= "/Boulangerie")
	public String pageAccueil(Model model) {
		List<Produit> produits = produitDao.findAll();
		
		model.addAttribute("ps", produits);
		return "Accueil";
	}
	
}
