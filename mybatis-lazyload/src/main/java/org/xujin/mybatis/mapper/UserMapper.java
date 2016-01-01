/**  
 * @Title: UserMapper.java
 * @Package org.xujin.mybatis.mapper
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com  
 * @date 2016-1-1 下午5:45:23
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybatis.mapper;

import org.xujin.mybatis.entity.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com
 * @date 2016-1-1 下午5:45:23
 * @Website http://www.xujin.org
 * 
 */
public interface UserMapper {

    // 根据用户id查询用户信息
    public User findUserById(int id) throws Exception;

}
