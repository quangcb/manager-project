package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;

import vn.edu.vnua.ktx.model.Contract;
import vn.edu.vnua.ktx.repository.ContractRepository;

public class ContractController {
    @Autowired
    private ContractRepository contractRepository;
}
