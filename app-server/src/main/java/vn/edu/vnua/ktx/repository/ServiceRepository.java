package vn.edu.vnua.ktx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    
}
