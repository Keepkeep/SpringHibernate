package demo.bean;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author huhu
 *	备注：记录目录信息
 *	时间：2017-10-18 09：04
 *	注意：如有修改：在下方写出修改字段 同时修改你本地数据库结构
 *	如：修改xxx字段数据库需改动。
 */
@Entity
@Table(name="myentry")
public class entry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer entryId;
	private String  orderNO;
	@ManyToOne
	@JoinColumn(name="orderNO",insertable=false,updatable=false)
	private Orders  orderbaen;
	private Integer proId;
	@ManyToOne
	@JoinColumn(name="proId",updatable=false,insertable=false)
	private Product productbean;
	private Integer ecount;
	private Date  entrytime;
	public Integer getEntryId() {
		return entryId;
	}
	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}
	public String getOrderNO() {
		return orderNO;
	}
	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}
	public Orders getOrderbaen() {
		return orderbaen;
	}
	public void setOrderbaen(Orders orderbaen) {
		this.orderbaen = orderbaen;
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
	public Integer getEcount() {
		return ecount;
	}
	public void setEcount(Integer ecount) {
		this.ecount = ecount;
	}
	public Date getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}
	@Override
	public String toString() {
		return "entry [entryId=" + entryId + ", orderNO=" + orderNO + ", proId=" + proId + ", ecount=" + ecount
				+ ", entrytime=" + entrytime + "]";
	}
	
}
