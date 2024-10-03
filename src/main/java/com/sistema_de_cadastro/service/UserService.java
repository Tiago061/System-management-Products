package com.sistema_de_cadastro.service;

import com.sistema_de_cadastro.model.User;
import com.sistema_de_cadastro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
}
