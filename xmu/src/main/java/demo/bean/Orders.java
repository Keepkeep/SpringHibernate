
package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author huhu
 *	��ע��������Ϣ
 *	ʱ�䣺2017-10-18 09��04
 *	ע�⣺�����޸ģ����·�д���޸��ֶ�
 *	�磺�޸�xxx�ֶ����ݿ���Ķ���
 */
@Entity
@Table(name="myorders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private String  orderNo;	//�������
	private String  sendName; //�ͻ�������
	private String  sendTel; //�ͻ��˵绰
	private String  payment; //֧����ʽ
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",locale="GTM+8")
	private Date ordtime;
	private Integer postId;
	@ManyToOne
	@JoinColumn(name="postId",insertable=false,updatable=false)
	private Post postbean;
	public Integer getOrderId() {
		return orderId;
	}
	private Integer proId;
	@ManyToOne
	@JoinColumn(name="proId",updatable=false,insertable=false)
	private Product productbean;
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getSendTel() {
		return sendTel;
	}
	public void setSendTel(String sendTel) {
		this.sendTel = sendTel;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public Date getOrdtime() {
		return ordtime;
	}
	public void setOrdtime(Date ordtime) {
		this.ordtime = ordtime;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Post getPostbean() {
		return postbean;
	}
	public void setPostbean(Post postbean) {
		this.postbean = postbean;
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
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderNo=" + orderNo + ", sendName=" + sendName + ", sendTel=" + sendTel
				+ ", payment=" + payment + ", ordtime=" + ordtime + ", postId=" + postId + ", proId=" + proId + "]";
	}
	
}
