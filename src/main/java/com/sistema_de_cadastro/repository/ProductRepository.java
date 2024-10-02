package com.sistema_de_cadastro.repository;


import com.sistema_de_cadastro.model.RegisterProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<RegisterProduct, Long> {
}
