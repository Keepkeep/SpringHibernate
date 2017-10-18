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
 *	��ע����Ʒ����Ŀ¼��Ϣ
 *	ʱ�䣺2017-10-18 09��04
 *	ע�⣺�����޸ģ����·�д���޸��ֶ� ͬʱ�޸��㱾�����ݿ�ṹ
 *	�磺�޸�xxx�ֶ����ݿ���Ķ���
 */
@Entity
@Table(name="mycsort")
public class Csort {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer csorId;
	private String  csortName;
	private Integer sorId;
	@ManyToOne
	@JoinColumn(name="sorId",updatable=false,insertable=false)
	private Sort sortbean;
	public Integer getCsorId() {
		return csorId;
	}
	public void setCsorId(Integer csorId) {
		this.csorId = csorId;
	}
	public String getCsortName() {
		return csortName;
	}
	public void setCsortName(String csortName) {
		this.csortName = csortName;
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
		return "Csort [csorId=" + csorId + ", csortName=" + csortName + ", sorId=" + sorId + "]";
	}
	
}
