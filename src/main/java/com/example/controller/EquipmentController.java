package com.example.controller;

import java.util.List;
import com.example.common.core.page.TableDataInfo;
import com.example.common.enums.BusinessType;
import com.example.domain.AjaxResult;
import com.example.domain.Equipment;
import com.example.service.IEquipmentService;
import com.example.common.annotation.Log ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * equipmentController
 * 
 * @author songc
 * @date 2024-03-04
 */
@RestController
@RequestMapping("/equipment/equipment")
public class EquipmentController extends BaseController{
    @Autowired
    private IEquipmentService equipmentService;

    /**
     * 查询equipment列表
     */
//    @PreAuthorize("@ss.hasPermi('equipment:equipment:list')")
    @GetMapping("/list")
    public TableDataInfo list(Equipment equipment)
    {
        startPage();
        List<Equipment> list = equipmentService.selectEquipmentList(equipment);
        return getDataTable(list);
    }

    /**
     * 获取equipment详细信息
     */
//    @PreAuthorize("@ss.hasPermi('equipment:equipment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(equipmentService.selectEquipmentById(id));
    }

    /**
     * 新增equipment
     */
//    @PreAuthorize("@ss.hasPermi('equipment:equipment:add')")
    @Log(title = "equipment", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Equipment equipment)
    {
        return toAjax(equipmentService.insertEquipment(equipment));
    }

    /**
     * 修改equipment
     */
//    @PreAuthorize("@ss.hasPermi('equipment:equipment:edit')")
    @Log(title = "equipment", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Equipment equipment)
    {
        return toAjax(equipmentService.updateEquipment(equipment));
    }

    /**
     * 删除equipment
     */
//    @PreAuthorize("@ss.hasPermi('equipment:equipment:remove')")
    @Log(title = "equipment", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(equipmentService.deleteEquipmentByIds(ids));
    }

}
