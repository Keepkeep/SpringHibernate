package demo.bean;

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
 *	��ע����Ʒ��Ϣ
 *	ʱ�䣺2017-10-18 09��04
 *	ע�⣺�����޸ģ����·�д���޸��ֶ�
 *	�磺�޸�xxx�ֶ����ݿ���Ķ���
 */
@Entity
@Table(name="myproduct")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer proId;
	private String proName;
	private Integer saleCount;
	private String  image;
	private Double price;
	private Double salePrice;
	private String decript; //��Ʒע��
	private Integer sorId;
	@ManyToOne //������Ʒ���ͱ�sortʵ���ࣩ
	@JoinColumn(name="sorid",insertable=false,updatable=false)
	private Sort sortbean;
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Integer getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public String getDecript() {
		return decript;
	}
	public void setDecript(String decript) {
		this.decript = decript;
	}
	public Integer getSorId() {
		return sorId;
	}
	public void setSorId(Integer sorId) {
		this.sorId = sorId;
	}
	
	public Sort getSortbean() {
		return sortbean;
	}
	public void setSortbean(Sort sortbean) {
		this.sortbean = sortbean;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", saleCount=" + saleCount + ", image=" + image
				+ ", price=" + price + ", salePrice=" + salePrice + ", decript=" + decript + ", sorId=" + sorId + "]";
	}
	
	
	
}
