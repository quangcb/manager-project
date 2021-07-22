package vn.edu.vnua.ktx.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Service")
public class Service {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "service_name", nullable = false, length = 30)
    private String serviceName;

    @Column(name = "service_description", nullable = false, length = 50)
    private String serviceDesciption;

    @Column(name = "service_price", nullable = false)
    private Integer servicePrice;

    @OneToOne(mappedBy = "service")
    private InvoiceDetail invoiceDetail;

    public Service(){
        //contructor
    }

    public Service(String serviceName, Integer servicePrice){
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public Long getServiceId(){
        return serviceId;
    }

    public void setServiceId(Long serviceId){
        this.serviceId = serviceId;
    }

    public String getServiceName(){
        return serviceName;
    }

    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
    }
    
    public String getServiceDescription(){
        return serviceDesciption;
    }

    public void setServiceDescription(String serviceDescription){
        this.serviceDesciption = serviceDescription;
    }

    public Integer getServicePrice(){
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice){
        this.servicePrice = servicePrice;
    }
}
