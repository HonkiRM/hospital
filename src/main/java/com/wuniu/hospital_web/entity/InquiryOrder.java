package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class InquiryOrder {
    private Integer id;

    private String ordernum;

    private Integer patientId;

    private Integer specialistId;

    private String type;

    private BigDecimal sum;

    private BigDecimal payment;

    private String means;

    private Integer status;

    private String remark;

    private String inquery;

    private Date ordertime;

    private Date paytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(Integer specialistId) {
        this.specialistId = specialistId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means == null ? null : means.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInquery() {
        return inquery;
    }

    public void setInquery(String inquery) {
        this.inquery = inquery == null ? null : inquery.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}