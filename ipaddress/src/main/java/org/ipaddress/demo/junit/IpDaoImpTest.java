package org.ipaddress.demo.junit;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.ipaddress.demo.dao.IpDao;
import org.ipaddress.demo.dao.IpDaoImp;
import org.ipaddress.demo.pojo.Ip;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
@RestController
public class IpDaoImpTest {

    @Test
   @RequestMapping(value = "/a",method = RequestMethod.GET)
    public void selectIpByIpAddressTest()
        throws Exception{
        IpDaoImp ipDao = new IpDaoImp();

        Ip ip1;
        ip1 = ipDao.selectIpByIpAddress("183.163.40.223");
        System.out.println(ip1);
        System.out.println(ip1.getIpAddress());
        System.out.println(ip1.getAnonymity());
//        return ip1.getIpAddress();



    }
}
