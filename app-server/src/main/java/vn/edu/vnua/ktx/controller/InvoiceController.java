 package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

import vn.edu.vnua.ktx.model.Invoice;
import vn.edu.vnua.ktx.repository.InvoiceRepository;

// @CrossOrigin(origins = "http://localhost:8080")
// @RestController
// @RequestMapping("/api")
 public class InvoiceController {
    
    @Autowired
    InvoiceRepository invoiceRepository;
 }
