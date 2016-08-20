package ro.andreimihaescu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.andreimihaescu.entity.User;
import ro.andreimihaescu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Boolean createUser(String username, String password){
        if (userRepository.findUserByUsername(username) == null){
            userRepository.save(new User(username, password));
            return true;
        }
        return false;
    }
}
