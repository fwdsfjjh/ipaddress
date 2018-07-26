package org.ipaddress.demo.dao;

import org.ipaddress.demo.pojo.Ip;

import java.io.IOException;

public interface IpDao {
    public Ip selectIpByIpAddress(String ipAddress) throws IOException;
}
