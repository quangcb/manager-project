package vn.edu.vnua.ktx.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

    Optional<Users> findByUsername(String username);

    boolean checkLogin(String username, String password);

}
