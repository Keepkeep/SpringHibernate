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
 *	备注：订单信息
 *	时间：2017-10-18 09：04
 *	注意：如有修改：在下方写出修改字段
 *	如：修改xxx字段数据库需改动。
 */
@Entity
@Table(name="myorders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private String  orderNo;	//订单编号
	private String  sendName; //送货人名字
	private String  sendAdress;//送货地址
	private String  sendZip;  //送货的邮编
	private String  sendTel; //送货人电话
	private String  payment; //支付方式
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
