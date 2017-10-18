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
 *	��ע����¼Ŀ¼��Ϣ
 *	ʱ�䣺2017-10-18 09��04
 *	ע�⣺�����޸ģ����·�д���޸��ֶ� ͬʱ�޸��㱾�����ݿ�ṹ
 *	�磺�޸�xxx�ֶ����ݿ���Ķ���
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
