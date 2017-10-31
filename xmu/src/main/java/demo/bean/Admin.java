package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myadmin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adminId;
	private String  adminName;
	private String  adminpwd;
	private String  perssion;
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminpwd() {
		return adminpwd;
	}
	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}
	public String getPerssion() {
		return perssion;
	}
	public void setPerssion(String perssion) {
		this.perssion = perssion;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminpwd=" + adminpwd + ", perssion="
				+ perssion + "]";
	}
	
}
