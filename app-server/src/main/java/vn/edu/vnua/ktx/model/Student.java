package vn.edu.vnua.ktx.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Student")
public class Student {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "firstname", nullable = false, length = 20)
	private String firstName;

    @Column(name = "lastname", nullable = false, length = 20)
	private String lastName;

    @Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;

    @Column(name = "gender", nullable = false, length = 20)
	private String gender;

    @Column(name = "address", nullable = false, length = 50)
	private String address;

    @Column(name = "student_code", nullable = false, length = 7)
	private String studentCode;

    @Column(name = "faculty", nullable = false, length = 20)
	private String faculty;

    @Column(name = "school_year", nullable = false, length = 11)
	private String schoolYear;

    @Column(name = "citizen_identity", nullable = false, length = 13)
	private String citizenIdentity;

    @Column(name = "phone", nullable = false, length = 11)
	private String phone;

    @Column(name = "email", nullable = false, length = 30)
	private String email;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
	private Users users;
    
    @OneToOne
    @JoinColumn(name = "dorm_id")
	private Dormitory dormitory;

    @OneToMany(mappedBy = "student")
    private Set<Contract> contract;

    @OneToMany(mappedBy = "student")
    private Set<Invoice> invoice;

    public Student(){
        //contructor
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getStudentId() {
		return studentId;
	}

    public void setStudentId(Long studentId){
        this.studentId = studentId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getStudentCode(){
        return studentCode;
    }

    public void setStudentCode(String studentCode){
        this.studentCode = studentCode;
    }

    public String getFaculty(){
        return faculty;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public String getSchoolYear(){
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear){
        this.schoolYear = schoolYear;
    }

    public String getCitizenIdentity(){
        return citizenIdentity;
    }

    public void setCitizenIdentity(String citizenIdentity){
        this.citizenIdentity = citizenIdentity;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
