package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="myshopcar")
public class Shopcar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer scarId;
	private Integer proId; //…Ã∆∑id
	private Integer scount;
	@ManyToOne
	@JoinColumn(name="proId",updatable=false,insertable=false)
	private Product productbean;
	private Integer userId;
	@ManyToOne
	@JoinColumn(name="userId",insertable=false,updatable=false)
	private Users usersbean;
	public Integer getScarId() {
		return scarId;
	}
	public void setScarId(Integer scarId) {
		this.scarId = scarId;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public Product getProductbean() {
		return productbean;
	}
	public void setProductbean(Product productbean) {
		this.productbean = productbean;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Users getUsersbean() {
		return usersbean;
	}
	public void setUsersbean(Users usersbean) {
		this.usersbean = usersbean;
	}
	
	public Integer getScount() {
		return scount;
	}
	public void setScount(Integer scount) {
		this.scount = scount;
	}
	@Override
	public String toString() {
		return "shopcar [scarId=" + scarId + ", proId=" + proId + ", userId=" + userId + "]";
	}
	
}
