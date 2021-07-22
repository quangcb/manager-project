package vn.edu.vnua.ktx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Utility_Bill")
public class UtilityBill {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "utility_bill_id")
    private Long utilityBillId;

    @Column(name = "billing_date", nullable = false)
    private Date billingDate;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "electric_previous", nullable = false)
    private Integer electricPrevious;

    @Column(name = "electric_present", nullable = false)
    private Integer electricPresent;

    @Column(name = "water_previous", nullable = false)
    private Integer waterPrevious;

    @Column(name = "water_present", nullable = false)
    private Integer waterPresent;

    @Column(name = "electric_price", nullable = false)
    private Integer electricPrice;

    @Column(name = "water_price", nullable = false)
    private Integer waterPrice;

    @Column(name = "total", nullable = false)
    private Integer total;

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    public UtilityBill(){
        //contructor
    }

    public Long getUtilityBillId(){
        return utilityBillId;
    }

    public void setUtilityBillId(Long utilityBillId){
        this.utilityBillId = utilityBillId;
    }

    public Date getBillingDate(){
        return billingDate;
    }

    public void setBillingDate(Date billingDate){
        this.billingDate = billingDate;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public Integer getElectricPrevious(){
        return electricPrevious;
    }

    public void setElectricPrevious(Integer electricPrevious){
        this.electricPrevious = electricPrevious;
    }

    public Integer getElectricPresent(){
        return electricPresent;
    }

    public void setElectricPresent(Integer electricPresent){
        this.electricPresent = electricPresent;
    }
    

    public Integer getWaterPrevious(){
        return waterPrevious;
    }

    public void setWaterPrevious(Integer waterPrevious){
        this.waterPrevious = waterPrevious;
    }
    
    public Integer getWaterPresnt(){
        return waterPresent;
    }

    public void setWaterPresent(Integer waterPresent){
        this.waterPresent = waterPresent;
    }

    public Integer getElectricPrice(){
        return electricPrice;
    }

    public void setElectricPrice(Integer electricPrice){
        this.electricPrice = electricPrice;
    }

    public Integer getWaterPrice(){
        return waterPrice;
    }

    public void setWaterPrice(Integer waterPrice){
        this.waterPrice = waterPrice;
    }

    public Integer getTotal(){
        return total;
    }

    public void setTotal(Integer total){
        this.total = total;
    }
}
