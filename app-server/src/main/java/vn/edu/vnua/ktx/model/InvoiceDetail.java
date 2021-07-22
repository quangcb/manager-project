package vn.edu.vnua.ktx.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Invoice_Detail")
public class InvoiceDetail {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_detail_id")
    private Long invoiceDetailId;

    @Column(name = "quantity")
	private Integer quantity;

    @Column(name = "price")
	private Integer price;

    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @OneToOne
    @JoinColumn(name = "service_id")
    private Service service;

    public InvoiceDetail(){
        //contructor
    }

    public InvoiceDetail(Integer quantity, Integer price){
        this.quantity = quantity;
        this.price = price;
    }

    public Long getInvoiceDetailId(){
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(Long invoiceDetailId){
        this.invoiceDetailId = invoiceDetailId;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }
}
