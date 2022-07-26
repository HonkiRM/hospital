package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Patient {
    private Integer id;

    private String name;

    private String gender;

    private String clinicsituation;

    private String patienttime;

    private String image;

    private Integer tel;

    private String address;

    private String email;

    private Integer illnessId;

    private String relation;

    private Date birth;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getClinicsituation() {
        return clinicsituation;
    }

    public void setClinicsituation(String clinicsituation) {
        this.clinicsituation = clinicsituation == null ? null : clinicsituation.trim();
    }

    public String getPatienttime() {
        return patienttime;
    }

    public void setPatienttime(String patienttime) {
        this.patienttime = patienttime == null ? null : patienttime.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getIllnessId() {
        return illnessId;
    }

    public void setIllnessId(Integer illnessId) {
        this.illnessId = illnessId;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
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