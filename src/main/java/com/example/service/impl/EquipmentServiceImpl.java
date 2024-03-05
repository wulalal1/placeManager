package com.example.service.impl;

import java.util.List;

import com.example.domain.Equipment;
import com.example.mapper.EquipmentMapper;
import com.example.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * equipmentService业务层处理
 * 
 * @author songc
 * @date 2024-03-04
 */
@Service
public class EquipmentServiceImpl implements IEquipmentService
{
    @Resource
    private EquipmentMapper equipmentMapper;

    /**
     * 查询equipment
     * 
     * @param id equipment主键
     * @return equipment
     */
    @Override
    public Equipment selectEquipmentById(Long id)
    {
        return equipmentMapper.selectEquipmentById(id);
    }

    /**
     * 查询equipment列表
     * 
     * @param equipment equipment
     * @return equipment
     */
    @Override
    public List<Equipment> selectEquipmentList(Equipment equipment)
    {
        return equipmentMapper.selectEquipmentList(equipment);
    }

    /**
     * 新增equipment
     * 
     * @param equipment equipment
     * @return 结果
     */
    @Override
    public int insertEquipment(Equipment equipment)
    {
        return equipmentMapper.insertEquipment(equipment);
    }

    /**
     * 修改equipment
     * 
     * @param equipment equipment
     * @return 结果
     */
    @Override
    public int updateEquipment(Equipment equipment)
    {
        return equipmentMapper.updateEquipment(equipment);
    }

    /**
     * 批量删除equipment
     * 
     * @param ids 需要删除的equipment主键
     * @return 结果
     */
    @Override
    public int deleteEquipmentByIds(Long[] ids)
    {
        return equipmentMapper.deleteEquipmentByIds(ids);
    }

    /**
     * 删除equipment信息
     * 
     * @param id equipment主键
     * @return 结果
     */
    @Override
    public int deleteEquipmentById(Long id)
    {
        return equipmentMapper.deleteEquipmentById(id);
    }
}
