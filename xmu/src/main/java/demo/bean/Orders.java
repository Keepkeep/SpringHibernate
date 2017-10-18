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
	private String  sendAdress;//�ͻ���ַ
	private String  sendZip;  //�ͻ����ʱ�
	private String  sendTel; //�ͻ��˵绰
	private String  payment; //֧����ʽ
	private String  meno;
	private Integer tag;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",locale="GTM+8")
	private Date ordtime;
	private Integer userId;
	@ManyToOne
	@JoinColumn(name="userId",insertable=false,updatable=false)
	private Users userbean;
	public Integer getOrderId() {
		return orderId;
	}
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
	public String getSendAdress() {
		return sendAdress;
	}
	public void setSendAdress(String sendAdress) {
		this.sendAdress = sendAdress;
	}
	public String getSendZip() {
		return sendZip;
	}
	public void setSendZip(String sendZip) {
		this.sendZip = sendZip;
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
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public Integer getTag() {
		return tag;
	}
	public void setTag(Integer tag) {
		this.tag = tag;
	}
	public Date getOrdtime() {
		return ordtime;
	}
	public void setOrdtime(Date ordtime) {
		this.ordtime = ordtime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Users getUserbean() {
		return userbean;
	}
	public void setUserbean(Users userbean) {
		this.userbean = userbean;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderNo=" + orderNo + ", sendName=" + sendName + ", sendAdress="
				+ sendAdress + ", sendZip=" + sendZip + ", sendTel=" + sendTel + ", payment=" + payment + ", meno="
				+ meno + ", tag=" + tag + ", ordtime=" + ordtime + ", userId=" + userId + "]";
	}
	
}
