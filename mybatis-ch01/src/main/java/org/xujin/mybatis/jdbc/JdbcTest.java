/**  
 * @Title: JdbcTest.java
 * @Package org.xujin.mybatis.first
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com  
 * @date 2015-12-20 下午9:06:34
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: JdbcTest
 * @Description:JDBC的回顾
 * @author Xu,Jin Software_King@qq.com
 * @date 2015-12-20 下午9:06:34
 * @Website http://www.xujin.org
 */
public class JdbcTest {
  public static void main(String[] args) {
    Connection connection = null;
    // PreparedStatement是预编译的Statement，通过Statement发起数据库的操作
    // PreparedStatement防止sql注入，执行数据库效率高
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {
      // 加载数据库驱动
      Class.forName("com.mysql.jdbc.Driver");
      // 通过驱动管理类获取数据库链接
      connection = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "root");
      // 定义sql语句 ?表示占位符
      String sql = "select * from user where username = ?";
      // 获取预处理statement
      preparedStatement = connection.prepareStatement(sql);
      // 设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
      preparedStatement.setString(1, "王五");
      // 向数据库发出sql执行查询，查询出结果集
      resultSet = preparedStatement.executeQuery();
      // 遍历查询结果集
      while (resultSet.next()) {
        System.out.println(resultSet.getString("id") + "  " + resultSet.getString("username"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // 释放资源
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (preparedStatement != null) {
        try {
          preparedStatement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }

    }

  }

}
