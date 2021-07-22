package vn.edu.vnua.ktx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
