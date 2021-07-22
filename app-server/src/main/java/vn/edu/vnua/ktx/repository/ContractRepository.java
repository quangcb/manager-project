package vn.edu.vnua.ktx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
    
}
