package vn.edu.vnua.ktx.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Dormitory")
public class Dormitory {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dorm_id")
    private Long dormId;

    @Column(name = "dorm_name", nullable = false, length = 11)
	private String dormName;

    @Column(name = "dorm_type", nullable = false, length = 20)
	private String dormType;

    @Column(name = "dorm_description", nullable = false, length = 50)
	private String dormDescription;

    @OneToOne(mappedBy = "dormitory")
	private Student student;

    @OneToMany(mappedBy = "dormitory")
    private Set<Room> room;

    public Dormitory(){
        //contructor
    }

    public Dormitory(String dormName, String dormType){
        this.dormName = dormName;
        this.dormType = dormType;
    }

    public Long getDormId(){
        return dormId;
    }

    public void setDormId(Long dormId){
        this.dormId = dormId;
    }

    public String getdormName(){
        return dormName;
    }

    public void setDormName(String dormName){
        this.dormName = dormName;
    }

    public String getDormType(){
        return dormType;
    }

    public void setDormType(String dormType){
        this.dormType = dormType;
    }

    public String getDormDescription(){
        return dormDescription;
    }

    public void setDormDescription(String dormDescription){
        this.dormDescription = dormDescription;
    }
}
