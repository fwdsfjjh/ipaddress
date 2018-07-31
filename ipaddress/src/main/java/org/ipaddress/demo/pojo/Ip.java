package org.ipaddress.demo.pojo;



import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ip {
    //    存储ip地址的数据表
    private Integer id;//代理主键
    private String ipAddress;//代理IP地址
    private String ipPort;//代理IP端口
    private Date createTime;//该IP地址被插入数据库里面的时间
    private String type_name;//代理的类型，默认为HTTP代理
    private String anonymity;//IP的代理透明度，透明、低匿名，高匿名
    private String location;//代理服务器的位置
    private Integer enable;//该ip地址是否还可用，0：不可用，1：可用
    private Integer usedSuccess;//该代理IP地址被成功使用过的次数，可以用来评价该代理IP地址的稳定性
    private String responseSpeed;//校验时该IP的响应速度，单位为秒，供参考IP性能
    private Integer checkTimes;//该代理IP地址被校验的次数
    private Date lastCheckTime;//上一次校验的时间，用于对IP地址的校验

    public Ip(Integer id, String ipAddress, String ipPort, Date createTime, String type_name, String anonymity, String location, Integer enable, Integer usedSuccess, String responseSpeed, Integer checkTimes, Date lastCheckTime) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.ipPort = ipPort;
        this.createTime = createTime;
        this.type_name = type_name;
        this.anonymity = anonymity;
        this.location = location;
        this.enable = enable;
        this.usedSuccess = usedSuccess;
        this.responseSpeed = responseSpeed;
        this.checkTimes = checkTimes;
        this.lastCheckTime = lastCheckTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpPort() {
        return ipPort;
    }

    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(String anonymity) {
        this.anonymity = anonymity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getUsedSuccess() {
        return usedSuccess;
    }

    public void setUsedSuccess(Integer usedSuccess) {
        this.usedSuccess = usedSuccess;
    }

    public String getResponseSpeed() {
        return responseSpeed;
    }

    public void setResponseSpeed(String responseSpeed) {
        this.responseSpeed = responseSpeed;
    }

    public Integer getCheckTimes() {
        return checkTimes;
    }

    public void setCheckTimes(Integer checkTimes) {
        this.checkTimes = checkTimes;
    }

    public Date getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(Date lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    @Override
    public String toString() {
        return "Ip{" +
                "id=" + id +
                ", ipAddress='" + ipAddress + '\'' +
                ", ipPort='" + ipPort + '\'' +
                ", createTime=" + createTime +
                ", type_name='" + type_name + '\'' +
                ", anonymity='" + anonymity + '\'' +
                ", location='" + location + '\'' +
                ", enable=" + enable +
                ", usedSuccess=" + usedSuccess +
                ", responseSpeed='" + responseSpeed + '\'' +
                ", checkTimes=" + checkTimes +
                ", lastCheckTime=" + lastCheckTime +
                '}';
    }
}