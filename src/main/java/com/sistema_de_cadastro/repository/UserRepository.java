package com.sistema_de_cadastro.repository;

import com.sistema_de_cadastro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
