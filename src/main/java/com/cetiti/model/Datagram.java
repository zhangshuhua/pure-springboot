package com.cetiti.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "datagram")
public class Datagram {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备id
     */
    @Column(name = "deviceID")
    private String deviceid;

    /**
     * 时区
     */
    @Column(name = "time_zone")
    private Short timeZone;

    /**
     * 采样时间，本地时间
     */
    private Date time;

    /**
     * E：东半球；W：西半球
     */
    @Column(name = "divisionEW")
    private String divisionew;

    /**
     * 精度
     */
    private Double longitude;

    /**
     * N：北半球；S：南半球
     */
    @Column(name = "divisionNS")
    private String divisionns;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 车辆方向=实际方向（以度为单位，正北方向为0，顺时针方向计算）*100
     */
    private Double direction;

    /**
     * 速度：厘米/小时
     */
    private Double speed;

    /**
     * 卫星数量：个
     */
    private Integer satellites;

    /**
     * 精度因子：原始值*100
     */
    @Column(name = "precision_value")
    private Double precisionValue;

    /**
     * 高度：厘米
     */
    private Double height;

    /**
     * 重传标记：0-本条GPS为实时包；1-本条GPS为重传包
     */
    @Column(name = "retrans_flag")
    private String retransFlag;

    /**
     * 回应标记，0：不需回应包，1：需回应包
     */
    @Column(name = "needs_response")
    private String needsResponse;

    /**
     * Remark:保留节点
     */
    private String remark;

    /**
     * 获取自增id
     *
     * @return id - 自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取设备id
     *
     * @return deviceID - 设备id
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备id
     *
     * @param deviceid 设备id
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取时区
     *
     * @return time_zone - 时区
     */
    public Short getTimeZone() {
        return timeZone;
    }

    /**
     * 设置时区
     *
     * @param timeZone 时区
     */
    public void setTimeZone(Short timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 获取采样时间，本地时间
     *
     * @return time - 采样时间，本地时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置采样时间，本地时间
     *
     * @param time 采样时间，本地时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取E：东半球；W：西半球
     *
     * @return divisionEW - E：东半球；W：西半球
     */
    public String getDivisionew() {
        return divisionew;
    }

    /**
     * 设置E：东半球；W：西半球
     *
     * @param divisionew E：东半球；W：西半球
     */
    public void setDivisionew(String divisionew) {
        this.divisionew = divisionew;
    }

    /**
     * 获取精度
     *
     * @return longitude - 精度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置精度
     *
     * @param longitude 精度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取N：北半球；S：南半球
     *
     * @return divisionNS - N：北半球；S：南半球
     */
    public String getDivisionns() {
        return divisionns;
    }

    /**
     * 设置N：北半球；S：南半球
     *
     * @param divisionns N：北半球；S：南半球
     */
    public void setDivisionns(String divisionns) {
        this.divisionns = divisionns;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取车辆方向=实际方向（以度为单位，正北方向为0，顺时针方向计算）*100
     *
     * @return direction - 车辆方向=实际方向（以度为单位，正北方向为0，顺时针方向计算）*100
     */
    public Double getDirection() {
        return direction;
    }

    /**
     * 设置车辆方向=实际方向（以度为单位，正北方向为0，顺时针方向计算）*100
     *
     * @param direction 车辆方向=实际方向（以度为单位，正北方向为0，顺时针方向计算）*100
     */
    public void setDirection(Double direction) {
        this.direction = direction;
    }

    /**
     * 获取速度：厘米/小时
     *
     * @return speed - 速度：厘米/小时
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * 设置速度：厘米/小时
     *
     * @param speed 速度：厘米/小时
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * 获取卫星数量：个
     *
     * @return satellites - 卫星数量：个
     */
    public Integer getSatellites() {
        return satellites;
    }

    /**
     * 设置卫星数量：个
     *
     * @param satellites 卫星数量：个
     */
    public void setSatellites(Integer satellites) {
        this.satellites = satellites;
    }

    /**
     * 获取精度因子：原始值*100
     *
     * @return precision_value - 精度因子：原始值*100
     */
    public Double getPrecisionValue() {
        return precisionValue;
    }

    /**
     * 设置精度因子：原始值*100
     *
     * @param precisionValue 精度因子：原始值*100
     */
    public void setPrecisionValue(Double precisionValue) {
        this.precisionValue = precisionValue;
    }

    /**
     * 获取高度：厘米
     *
     * @return height - 高度：厘米
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置高度：厘米
     *
     * @param height 高度：厘米
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 获取重传标记：0-本条GPS为实时包；1-本条GPS为重传包
     *
     * @return retrans_flag - 重传标记：0-本条GPS为实时包；1-本条GPS为重传包
     */
    public String getRetransFlag() {
        return retransFlag;
    }

    /**
     * 设置重传标记：0-本条GPS为实时包；1-本条GPS为重传包
     *
     * @param retransFlag 重传标记：0-本条GPS为实时包；1-本条GPS为重传包
     */
    public void setRetransFlag(String retransFlag) {
        this.retransFlag = retransFlag;
    }

    /**
     * 获取回应标记，0：不需回应包，1：需回应包
     *
     * @return needs_response - 回应标记，0：不需回应包，1：需回应包
     */
    public String getNeedsResponse() {
        return needsResponse;
    }

    /**
     * 设置回应标记，0：不需回应包，1：需回应包
     *
     * @param needsResponse 回应标记，0：不需回应包，1：需回应包
     */
    public void setNeedsResponse(String needsResponse) {
        this.needsResponse = needsResponse;
    }

    /**
     * 获取Remark:保留节点
     *
     * @return remark - Remark:保留节点
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置Remark:保留节点
     *
     * @param remark Remark:保留节点
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}