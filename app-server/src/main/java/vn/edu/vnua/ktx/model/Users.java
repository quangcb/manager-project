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
@Table(name = "Users")
public class Users {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username", nullable = false, length = 30)
	private String username;

    @Column(name = "password", nullable = false, length = 30)
	private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
	private Role role;

    @OneToOne(mappedBy = "users")
    private Staff staff;

    @OneToOne(mappedBy = "users")
    private Student student;

    public Users(){
        //contructor
    }

    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getUserId() {
		return userId;
	}

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getUserName(){
        return username;
    }

    public void setUserName(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

}
