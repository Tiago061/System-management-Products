package com.sistema_de_cadastro.repository;


import com.sistema_de_cadastro.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
