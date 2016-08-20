package ro.andreimihaescu.repository;

import ro.andreimihaescu.entity.User;

public interface UserRepositoryCustom {
    public User findUserByUsername(String username);
}
