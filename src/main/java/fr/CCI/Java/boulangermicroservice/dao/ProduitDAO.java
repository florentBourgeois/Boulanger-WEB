package fr.CCI.Java.boulangermicroservice.dao;

import fr.CCI.Java.boulangermicroservice.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitDAO extends JpaRepository<Produit, Integer> {

    Produit findById(int id);
    Produit findByNom(String id);
    List<Produit> findByValeurGreaterThan(int val);
}
