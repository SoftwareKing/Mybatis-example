/**  
 * @Title: UserDao.java
 * @Package org.xujin.mybtais.dao
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com  
 * @date 2015-12-21 下午10:40:58
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybtais.dao;

import java.util.List;

import org.xujin.mybtais.entity.User;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com
 * @date 2015-12-21 下午10:40:58
 * @Website http://www.xujin.org
 * 
 */
public interface UserDao {
    // 根据id查询用户信息
    public User findUserById(int id) throws Exception;

    // 根据用户名称模糊查询用户列表
    public List<User> findUserByUsername(String username) throws Exception;

    // 插入用户
    public void insertUser(User user) throws Exception;

}
