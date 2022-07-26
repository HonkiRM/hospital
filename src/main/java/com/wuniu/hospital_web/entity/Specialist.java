package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Specialist {
    private Integer id;

    private String name;

    private Integer managerId;

    private BigDecimal picturecharge;

    private BigDecimal videocharge;

    private String areasexpertise;

    private String personnelprofile;

    private Date createtime;

    private Date edittime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public BigDecimal getPicturecharge() {
        return picturecharge;
    }

    public void setPicturecharge(BigDecimal picturecharge) {
        this.picturecharge = picturecharge;
    }

    public BigDecimal getVideocharge() {
        return videocharge;
    }

    public void setVideocharge(BigDecimal videocharge) {
        this.videocharge = videocharge;
    }

    public String getAreasexpertise() {
        return areasexpertise;
    }

    public void setAreasexpertise(String areasexpertise) {
        this.areasexpertise = areasexpertise == null ? null : areasexpertise.trim();
    }

    public String getPersonnelprofile() {
        return personnelprofile;
    }

    public void setPersonnelprofile(String personnelprofile) {
        this.personnelprofile = personnelprofile == null ? null : personnelprofile.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}