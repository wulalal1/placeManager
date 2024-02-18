package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
/**
 * @description place
 * @author Whhh
 * @date 2024-02-13
 */
@Data
@EqualsAndHashCode
public class Place implements Serializable {

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
     * 场地名称
     */
    private String placeName;

    /**
     * 场地长
     */
    private String placeLong;

    /**
     * 场地宽
     */
    private String placeWide;

    /**
     * 场地性质
     */
    private String placeNature;

    /**
     * 场地费用
     */
    private String placeCharge;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 场地状态
     */
    private String placeSatus;

    /**
     * 场地归属者
     */
    private String placeOwner;

    /**
     * 场地图片
     */
    private String placeAvatar;

    /**
     * 备注
     */
    private String remarks;

}