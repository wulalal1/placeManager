package com.example.mapper;

import com.example.domain.Equipment;

import java.util.List;


/**
 * equipmentMapper接口
 * 
 * @author songc
 * @date 2024-03-04
 */
public interface EquipmentMapper 
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
     * 删除equipment
     * 
     * @param id equipment主键
     * @return 结果
     */
    public int deleteEquipmentById(Long id);

    /**
     * 批量删除equipment
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEquipmentByIds(Long[] ids);
}
