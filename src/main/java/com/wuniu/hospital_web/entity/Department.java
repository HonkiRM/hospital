package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Department {
    private Integer id;

    private String name;

    private String departmentnum;

    private String address;

    private String departmenttel;

    private String notes;

    private Integer sort;

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

    public String getDepartmentnum() {
        return departmentnum;
    }

    public void setDepartmentnum(String departmentnum) {
        this.departmentnum = departmentnum == null ? null : departmentnum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDepartmenttel() {
        return departmenttel;
    }

    public void setDepartmenttel(String departmenttel) {
        this.departmenttel = departmenttel == null ? null : departmenttel.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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