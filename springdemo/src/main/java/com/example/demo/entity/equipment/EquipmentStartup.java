package com.example.demo.entity.equipment;

import com.example.demo.entity.BaseEntity;
import com.example.demo.entity.project.ProjectEquipmentApproval;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class EquipmentStartup extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "equipment_id")
    private ProjectEquipmentApproval projectEquipmentApproval;

    /**
     * 设备编号
     */
    private String equipmentCode;

    /**
     * 设备实施名称
     */
    private String equipmentImplementationName;

    /**
     * 属性编号
     */
    private String equipmentAttributeCode;

    /**
     * 实施部门
     */
    private String equipmentImplementationDepartment;

    /**
     * 设备责任人
     */
    private String equipmentResponsiblePerson;

    /**
     * 节点名称
     */
    private String equipmentNodeName;

    /**
     * 计划时间
     */
    private String equipmentNodeTime;

}
