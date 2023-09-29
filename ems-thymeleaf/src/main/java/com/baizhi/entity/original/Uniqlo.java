/*
*
* Uniqlo.java
* Copyright(C) 2017-2020 fendo公司
* @date 2023-09-29
*/
package com.baizhi.entity.original;

import java.util.Date;

public class Uniqlo {
    private Integer id;

    private String name;

    private String type;

    private String size;

    private String sex;

    private String photo;

    private Date salebegin;

    private Date saleend;

    private Integer price;

    private String deleteFlg;

    private Date createTime;

    private String createUserId;

    private Date updateTime;

    private String updateUserId;

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
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getSalebegin() {
        return salebegin;
    }

    public void setSalebegin(Date salebegin) {
        this.salebegin = salebegin;
    }

    public Date getSaleend() {
        return saleend;
    }

    public void setSaleend(Date saleend) {
        this.saleend = saleend;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}