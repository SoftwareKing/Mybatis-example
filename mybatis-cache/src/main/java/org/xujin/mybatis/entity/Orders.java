/**  
 * @Title: Orders.java
 * @Package org.xujin.mybatis.entity
 * @Description: Orders
 * @author Xu,Jin Software_King@qq.com  
 * @date 2016-1-1 下午5:39:07
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Orders
 * @Description: Orders
 * @author Xu,Jin Software_King@qq.com
 * @date 2016-1-1 下午5:39:07
 * @Website http://www.xujin.org
 * 
 */

public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;

    // 关联用户信息
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
