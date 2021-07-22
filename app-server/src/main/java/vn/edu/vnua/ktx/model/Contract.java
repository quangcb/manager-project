package vn.edu.vnua.ktx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Contract")
public class Contract {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Long contractId;

    @Column(name = "start_date", nullable = false)
	private Date startDate;

    @Column(name = "end_date", nullable = false)
	private Date endDate;

    @ManyToOne
    @JoinColumn(name="staff_id")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    public Contract(){
        //contructor
    }

    public Contract(Date startDate, Date endDate ){
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getContractId(){
        return contractId;
    }

    public void setContractId(Long contractId){
        this.contractId = contractId;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate =startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
}
