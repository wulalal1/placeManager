package com.example.service;

import com.example.domain.Equipment;

import java.util.List;


/**
 * equipmentService接口
 * 
 * @author songc
 * @date 2024-03-04
 */
public interface IEquipmentService 
{
    /**
     * 查询equipment
     * 
     * @param id equipment主键
     * @return equipment
     */
    public Equipment selectEquipmentById(Long id);

    /**
     * 查询equipment列表
     * 
     * @param equipment equipment
     * @return equipment集合
     */
    public List<Equipment> selectEquipmentList(Equipment equipment);

    /**
     * 新增equipment
     * 
     * @param equipment equipment
     * @return 结果
     */
    public int insertEquipment(Equipment equipment);

    /**
     * 修改equipment
     * 
     * @param equipment equipment
     * @return 结果
     */
    public int updateEquipment(Equipment equipment);

    /**
     * 批量删除equipment
     * 
     * @param ids 需要删除的equipment主键集合
     * @return 结果
     */
    public int deleteEquipmentByIds(Long[] ids);

    /**
     * 删除equipment信息
     * 
     * @param id equipment主键
     * @return 结果
     */
    public int deleteEquipmentById(Long id);
}
