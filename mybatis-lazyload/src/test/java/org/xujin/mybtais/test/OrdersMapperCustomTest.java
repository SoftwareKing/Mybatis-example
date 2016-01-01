/**  
 * @Title: OrdersMapperCustomTest.java
 * @Package org.xujin.mybtais.test
 * @Description: OrdersMapperCustomTest
 * @author Xu,Jin Software_King@qq.com  
 * @date 2016-1-1 下午5:53:20
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybtais.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.xujin.mybatis.entity.Orders;
import org.xujin.mybatis.entity.User;
import org.xujin.mybatis.mapper.OrdersMapperCustom;

/**
 * @ClassName: OrdersMapperCustomTest
 * @Description: OrdersMapperCustomTest
 * @author Xu,Jin Software_King@qq.com
 * @date 2016-1-1 下午5:53:20
 * @Website http://www.xujin.org
 * 
 */
public class OrdersMapperCustomTest {

    // 会话工厂
    private SqlSessionFactory sqlSessionFactory;

    // 创建工厂
    @Before
    public void init() throws IOException {

        // 配置文件（SqlMapConfig.xml）
        String resource = "SqlMapConfig.xml";

        // 加载配置文件到输入 流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    // 一对一查询延迟加载
    @Test
    public void testFindOrderUserListLazyLoading() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 创建mapper代理对象
        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);

        // 调用方法
        List<Orders> list = ordersMapperCustom.findOrderUserListLazyLoading();

        // 这里执行延迟加载，要发出sql
        User user = list.get(0).getUser();
        System.out.println(user);

    }

}
