package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PrescriptionMedicine {
    private Integer id;

    private Integer prescriptionId;

    private Integer medicineId;

    private String usage;

    private Date createtime;

    private Date edittime;

    private Integer status;

    private String doze;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
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

    public String getDoze() {
        return doze;
    }

    public void setDoze(String doze) {
        this.doze = doze == null ? null : doze.trim();
    }
}