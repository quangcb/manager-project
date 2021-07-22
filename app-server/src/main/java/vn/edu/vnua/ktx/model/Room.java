package vn.edu.vnua.ktx.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Room")
public class Room {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_name", nullable = false, length = 11)
	private String roomName;

    @Column(name = "student_count", nullable = false, length = 4)
    private Integer studentCount;

    @Column(name = "room_description", nullable = false, length = 50)
	private String roomDescription;

    @Column(name = "price", nullable = false)
	private Integer price;

    @OneToMany(mappedBy = "room")
    private Set<Contract> contract;

    @OneToMany(mappedBy = "room")
    private Set<UtilityBill> utilityBill;

    @ManyToOne
    @JoinColumn(name = "dorm_id", nullable = false)
    private Dormitory dormitory;

    public Room(){
        //contructor
    }

    public Room(String roomName, Integer price ){
        this.roomName = roomName;
        this.price = price;
    }

    public Long getRoomId(){
        return roomId;
    }

    public void setRoomId(Long roomId){
        this.roomId = roomId;
    }

    public String getRoomName(){
        return roomName;
    }

    public void setRoomName(String roomName){
        this.roomName = roomName;
    }

    public Integer getStudentCount(){
        return studentCount;
    }

    public void setStudentCount(Integer studentCount){
        this.studentCount = studentCount;
    }

    public String getRoomDescription(){
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription){
        this.roomDescription = roomDescription;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }
}
