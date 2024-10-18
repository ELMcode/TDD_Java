package org.example.BDD.exercice1.service;

import org.example.BDD.exercice1.exceptions.UserAlreadyExistsException;
import org.example.BDD.exercice1.model.User;
import org.example.BDD.exercice1.repository.UserRepository;

public class AccountService {
    private UserRepository userRepository;

    public AccountService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(String email, String username, String password) {
        if (userRepository.findByUsername(username) != null) {
            throw new UserAlreadyExistsException("L'utilsiateur existe déjà");
        }
        User user = new User(email, username, password);
        userRepository.save(user);
    }
}
