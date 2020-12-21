package com.example.demo.entity.project;

import com.example.demo.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ProjectEquipmentApproval extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectSummary projectSummary;

    /**
     * 阶段名称
     */
    private String equipmentStage;

    /**
     * 设备批复序号
     */
    private String equipmentApprovalNo;

    /**
     * 设备批复名称
     */
    private String equipmentApprovalName;
    /**
     * 规格型号(供参考)
     */
    private String equipmentSpecification;
    /**
     * 主要技术(性能)指标
     */
    private String equipmentMainTechTarget;
    /**
     * 制造厂/国别(供参考)
     */
    private String equipmentManufacturerAndCountry;
    /**
     * 单位(台/套)
     */
    private int equipmentUnit;
    /**
     * 数量
     */
    private int equipmentNumber;
    /**
     * 批复金额(RMB)
     */
    @Column(columnDefinition="decimal(10,2)")
    private BigDecimal equipmentApprovedRMB;
    /**
     * 批复金额(外汇)
     */
    @Column(columnDefinition="decimal(10,2)")
    private BigDecimal equipmentApprovedForeignExchange;
    /**
     * 招标情况
     */
    private Boolean equipmentBidSituation;
    /**
     * 备注
     */
    private String equipmentComment;

}
