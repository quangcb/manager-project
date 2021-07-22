package vn.edu.vnua.ktx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Invoice")
public class Invoice {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private Long invoiceId;

    @Column(name = "start_date")
	private Date startDate;

    @Column(name = "total")
	private Integer total;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne(mappedBy = "invoice")
    private InvoiceDetail invoiceDetail;

    public Invoice(){
        //contructor
    }

    public Invoice(Date startDate, Integer total){
        this.startDate = startDate;
        this.total = total;
    }

    public Long getInvoiceId(){
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId){
        this.invoiceId = invoiceId;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Integer getTotal(){
        return total;
    }

    public void setTotal(Integer total){
        this.total = total;
    }
}
