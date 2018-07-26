package org.ipaddress.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.ipaddress.demo.pojo.Ip;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@Component
public class IpDaoImp implements IpDao {
    //注入工厂
    private SqlSessionFactory sqlSessionFactory;

    public IpDaoImp(SqlSessionFactory sqlSessionFactory1) {
        this.sqlSessionFactory = sqlSessionFactory1;
    }

    public IpDaoImp() {
    }

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "sqlMapConfig11.xml";
        InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    //按地域查询

    public Ip selectIpByIpAddress(String ipAddress) throws IOException {

        SqlSessionFactory sqlSessionFactory1 = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory1.openSession();
        Ip ip = new Ip();
        ip = sqlSession.selectOne("mapper.IpDao.selectIpByIpAddress", ipAddress);
        sqlSession.close();
        return ip;

    }

}



