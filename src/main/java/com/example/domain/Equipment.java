package com.example.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.example.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * equipment对象 equipment
 * 
 * @author songc
 * @date 2024-03-04
 */
public class Equipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 器材编号 */
    private String equipCode;

    /** 器材名称 */
    private String equipName;

    /** 器材类型 */
    private String equipType;

    /** 单价 */
    private BigDecimal price;

    /** 器材图片 */
    private String equipPicture;

    /** 长度 */
    private String longth;

    /** 宽度 */
    private String width;

    /** 高度 */
    private String high;

    /** 重量 */
    private Long weight;

    /** 数量 */
    private Long number;

    /**  状态(借出/未借出) */
    private String status;

    /** 生产厂家 */
    private String producer;

    /** 购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date purchasingDate;

    /** 备注 */
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEquipCode(String equipCode) 
    {
        this.equipCode = equipCode;
    }

    public String getEquipCode() 
    {
        return equipCode;
    }
    public void setEquipName(String equipName) 
    {
        this.equipName = equipName;
    }

    public String getEquipName() 
    {
        return equipName;
    }
    public void setEquipType(String equipType) 
    {
        this.equipType = equipType;
    }

    public String getEquipType() 
    {
        return equipType;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setEquipPicture(String equipPicture) 
    {
        this.equipPicture = equipPicture;
    }

    public String getEquipPicture() 
    {
        return equipPicture;
    }
    public void setLongth(String longth) 
    {
        this.longth = longth;
    }

    public String getLongth() 
    {
        return longth;
    }
    public void setWidth(String width) 
    {
        this.width = width;
    }

    public String getWidth() 
    {
        return width;
    }
    public void setHigh(String high) 
    {
        this.high = high;
    }

    public String getHigh() 
    {
        return high;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setProducer(String producer) 
    {
        this.producer = producer;
    }

    public String getProducer() 
    {
        return producer;
    }
    public void setPurchasingDate(Date purchasingDate) 
    {
        this.purchasingDate = purchasingDate;
    }

    public Date getPurchasingDate() 
    {
        return purchasingDate;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("equipCode", getEquipCode())
            .append("equipName", getEquipName())
            .append("equipType", getEquipType())
            .append("price", getPrice())
            .append("equipPicture", getEquipPicture())
            .append("longth", getLongth())
            .append("width", getWidth())
            .append("high", getHigh())
            .append("weight", getWeight())
            .append("number", getNumber())
            .append("status", getStatus())
            .append("producer", getProducer())
            .append("purchasingDate", getPurchasingDate())
            .append("remarks", getRemarks())
            .toString();
    }
}
