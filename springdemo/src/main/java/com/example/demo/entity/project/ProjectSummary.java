package com.example.demo.entity.project;

import com.example.demo.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class ProjectSummary extends BaseEntity {
    /**
     * 项目编号
     */
    private String projectCode;

    /**
     * 项目全称
     */
    private String projectName;

    /**
     * 项目简称
     */
    private String projectShortName;

    /**
     * 创建人
     */
    private String projectCreatedPerson;

    /**
     * 创建日期
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date projectCreatedDate;

    /**
     * 项目状态
     */
    private Boolean projectStatus;
}
