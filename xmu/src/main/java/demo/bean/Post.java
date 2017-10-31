package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mypost")//µÿ÷∑±Ì
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer postId;
	private String  postAdress;
	private String  postname;
	private String  postTel;
	private Integer userId;
	@ManyToOne
	@JoinColumn(name="userId",insertable=false,updatable=false)
	private Users usersbaen;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPostAdress() {
		return postAdress;
	}
	public void setPostAdress(String postAdress) {
		this.postAdress = postAdress;
	}
	public String getPostname() {
		return postname;
	}
	public void setPostname(String postname) {
		this.postname = postname;
	}
	public String getPostTel() {
		return postTel;
	}
	public void setPostTel(String postTel) {
		this.postTel = postTel;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Users getUsersbaen() {
		return usersbaen;
	}
	public void setUsersbaen(Users usersbaen) {
		this.usersbaen = usersbaen;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postAdress=" + postAdress + ", postname=" + postname + ", postTel="
				+ postTel + ", userId=" + userId + "]";
	}
	
}
