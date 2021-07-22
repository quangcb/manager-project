package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.vnua.ktx.model.Service;
import vn.edu.vnua.ktx.repository.ServiceRepository;

public class ServiceController {
    
    @Autowired
    private ServiceRepository serviceRepository;
}
