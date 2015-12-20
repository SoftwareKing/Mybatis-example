package org.xujin.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * <p>Title: User</p>
 * <p>Description: 用户po类</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-17上午10:00:07
 * @version 1.0
 */
public class User implements Serializable {
	/**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int id;
	private String username;// 用户姓名
	private String sex;// 性别
	private Date birthday;// 生日
	private String address;// 地址
	
	//多个订单
	//private List<Orders> orderlist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/*public List<Orders> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(List<Orders> orderlist) {
		this.orderlist = orderlist;
	}*/
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}
	
	
}
