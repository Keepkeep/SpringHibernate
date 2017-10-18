package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myAdmin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adminId;
	private String  adminName;
	private String  amdpwd;
	private Integer perssin;
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
	public String getAmdpwd() {
		return amdpwd;
	}
	public void setAmdpwd(String amdpwd) {
		this.amdpwd = amdpwd;
	}
	public Integer getPerssin() {
		return perssin;
	}
	public void setPerssin(Integer perssin) {
		this.perssin = perssin;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", amdpwd=" + amdpwd + ", perssin=" + perssin
				+ "]";
	}
	

}
