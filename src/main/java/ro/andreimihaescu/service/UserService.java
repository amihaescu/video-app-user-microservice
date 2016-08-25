package ro.andreimihaescu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.andreimihaescu.entity.User;
import ro.andreimihaescu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Long createUser(String username, String password){
        if (userRepository.findUserByUsername(username) == null){
            User u  =userRepository.save(new User(username, password));
            return u.getId();
        }
        return 0L;
    }

    public Boolean authenticateUser(String username, String password){
        User u = userRepository.findUserByUsername(username);
        if (u != null && u.getPassword().equals(password)){
                return true;
            }
        return false;
    }
}
