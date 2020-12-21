package com.example.demo.entity.project;

import com.example.demo.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class ProjectBasicInformation extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectSummary projectSummary;

    /**
     * 项目阶段
     */
    private String projectStage;

    /**
     * 建设周期
     */
    private String projectBuildCycle;

    /**
     * 开工时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date projectStartDate;

    /**
     * 批复投资（万元）
     */
    @Column(columnDefinition="decimal(10,2)")
    private BigDecimal projectApprovedInvestment;

    /**
     * 国拨（万元）
     */
    @Column(columnDefinition="decimal(10,2)")
    private BigDecimal projectCountryInvestment;

    /**
     * 自筹（万元）
     */
    @Column(columnDefinition="decimal(10,2)")
    private BigDecimal projectOtherInvestment;


}
