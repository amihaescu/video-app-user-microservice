package ro.andreimihaescu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.andreimihaescu.entity.User;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
