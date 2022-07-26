package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Withdraw {
    private Integer id;

    private Integer managerId;

    private String bank;

    private BigDecimal amount;

    private BigDecimal commission;

    private Date withdrawtime;

    private Integer status;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Date getWithdrawtime() {
        return withdrawtime;
    }

    public void setWithdrawtime(Date withdrawtime) {
        this.withdrawtime = withdrawtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}