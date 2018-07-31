package org.ipaddress.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ipaddress.demo.pojo.Ip;
import org.springframework.stereotype.Repository;

import java.io.IOException;
@Repository
@Mapper
public interface IpDao {



    Ip selectIpByIpAddress(String ipAddreess) throws IOException;
}
