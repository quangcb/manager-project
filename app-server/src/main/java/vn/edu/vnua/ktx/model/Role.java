package vn.edu.vnua.ktx.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Role")
public class Role {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name", nullable = false, length = 30)
	private String roleName;

    @OneToOne(mappedBy = "role")
    private Users users;

    public Role(){
        //contructor
    }

    public Role(String roleName) {
		this.roleName = roleName;
	}

    public Long getRoleId() {
		return roleId;
	}

    public void setRoleId(Long roleId){
        this.roleId = roleId;
    }

    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
