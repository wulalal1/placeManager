package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @description reservation
 * @author Whhh
 * @date 2024-02-15
 */
@Data
@EqualsAndHashCode
public class Reservation extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 场地编号
     */
    private String placeCode;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 预约姓名
     */
    private String reservationName;

    /**
     * 预约人姓名
     */
    private String reservationPName;

    /**
     * 预约人电话
     */
    private String reservationPPhone;

    /**
     * 预约状态
     */
    private String reservationStatus;

    /**
     * 用户表外键
     */
    private Integer userId;

    /**
     * 预约原因
     */
    private String reservationReason;

    /**
     * 预约取消原因
     */
    private String reservationQxReason;

    /**
     * 预约类型
     */
    private String reservationType;

}