package org.ipaddress.demo.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.ipaddress.demo.pojo.Ip;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
@RunWith(SpringRunner.class)
@SpringBootTest
 public  class    IpDaoTest  {
@Autowired
private IpDao ipDao;
@org.junit.Test

       public void selectIpByIpAddress() throws IOException {
//        String resource = "mybatis/sqlMapConfig11.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession =  sqlSessionFactory.openSession();
        Ip ip = ipDao.selectIpByIpAddress("183.163.40.223");
//        Ip ip =sqlSession .selectOne("183.163.40.223");
        System.out.println(ip);
//        sqlSession.close();
//       return  ip;

    }
}