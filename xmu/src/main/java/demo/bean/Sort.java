package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author huhu
 * 产品类型实体类
 * time 2017-10-18  8:46
 */
@Entity
@Table(name="mysort")
public class Sort {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sortId;
	private String  sortName;
	private String  sortImg;
	public Integer getSortId() {
		return sortId;
	}
	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public String getSortImg() {
		return sortImg;
	}
	public void setSortImg(String sortImg) {
		this.sortImg = sortImg;
	}
	@Override
	public String toString() {
		return "Sort [sortId=" + sortId + ", sortName=" + sortName + ", sortImg=" + sortImg + "]";
	}
	
}
