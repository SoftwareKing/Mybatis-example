/**  
 * @Title: UserDaoImpl.java
 * @Package org.xujin.mybtais.dao
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com  
 * @date 2015-12-21 下午10:44:14
 * @Website http://www.xujin.org
 * @version V1.0
 */
package org.xujin.mybtais.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.xujin.mybtais.entity.User;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com
 * @date 2015-12-21 下午10:44:14
 * @Website http://www.xujin.org
 * 
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    // 将SqlSessionFactory注入
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) throws Exception {

        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 根据id查询用户信息
        User user = sqlSession.selectOne("test.findUserById", id);

        sqlSession.close();

        return user;

    }

    @Override
    public List<User> findUserByUsername(String username) throws Exception {
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("test.findUserByName", username);
        sqlSession.close();
        return list;
    }

    @Override
    public void insertUser(User user) throws Exception {
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertUser", user);
        sqlSession.commit();
        sqlSession.close();

    }
}
