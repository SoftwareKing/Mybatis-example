/**  
 * @Title: OrdersMapperCustom.java
 * @Package org.xujin.mybatis.mapper
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com  
 * @date 2016-1-1 下午5:37:30
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybatis.mapper;

import java.util.List;

import org.xujin.mybatis.entity.Orders;

/**
 * @ClassName: OrdersMapperCustom
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com
 * @date 2016-1-1 下午5:37:30
 * @Website http://www.xujin.org
 * 
 */
public interface OrdersMapperCustom {
    // 一对一查询，延迟加载
    public List<Orders> findOrderUserListLazyLoading() throws Exception;

}
