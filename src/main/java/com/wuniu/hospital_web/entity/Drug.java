package com.wuniu.hospital_web.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Drug {
    private Integer id;

    private String name;

    private String image;

    private Double marketprice;

    private Double sellingprice;

    private String drugclass;

    private String drugunit;

    private Integer approvalnumber;

    private String functionindis;

    private String adversereaction;

    private String mattersattention;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getDrugclass() {
        return drugclass;
    }

    public void setDrugclass(String drugclass) {
        this.drugclass = drugclass == null ? null : drugclass.trim();
    }

    public String getDrugunit() {
        return drugunit;
    }

    public void setDrugunit(String drugunit) {
        this.drugunit = drugunit == null ? null : drugunit.trim();
    }

    public Integer getApprovalnumber() {
        return approvalnumber;
    }

    public void setApprovalnumber(Integer approvalnumber) {
        this.approvalnumber = approvalnumber;
    }

    public String getFunctionindis() {
        return functionindis;
    }

    public void setFunctionindis(String functionindis) {
        this.functionindis = functionindis == null ? null : functionindis.trim();
    }

    public String getAdversereaction() {
        return adversereaction;
    }

    public void setAdversereaction(String adversereaction) {
        this.adversereaction = adversereaction == null ? null : adversereaction.trim();
    }

    public String getMattersattention() {
        return mattersattention;
    }

    public void setMattersattention(String mattersattention) {
        this.mattersattention = mattersattention == null ? null : mattersattention.trim();
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