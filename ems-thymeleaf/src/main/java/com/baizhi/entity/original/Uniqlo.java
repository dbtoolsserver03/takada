/*
*
* Uniqlo.java
* Copyright(C) 2017-2020 saisk
* @date 2023-09-29
*/
package com.baizhi.entity.original;

import java.util.Date;

public class Uniqlo {
    /**
     * 
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 上身/下身/脚
     */
    private String type;

    /**
     * 尺寸规格
     */
    private String size;

    /**
     * 适用性别
     */
    private String sex;

    /**
     * 商品照片路径
     */
    private String photo;

    /**
     * 销售开始日
     */
    private Date saleBegin;

    /**
     * 销售终了日
     */
    private Date saleEnd;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 削除フラグ
     */
    private String deleteFlg;

    /**
     * 登録日時
     */
    private Date createTime;

    /**
     * 登録者
     */
    private String createUserId;

    /**
     * 更新日時
     */
    private Date updateTime;

    /**
     * 更新者
     */
    private String updateUserId;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品名称
     * @return name 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 上身/下身/脚
     * @return type 上身/下身/脚
     */
    public String getType() {
        return type;
    }

    /**
     * 上身/下身/脚
     * @param type 上身/下身/脚
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 尺寸规格
     * @return size 尺寸规格
     */
    public String getSize() {
        return size;
    }

    /**
     * 尺寸规格
     * @param size 尺寸规格
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 适用性别
     * @return sex 适用性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 适用性别
     * @param sex 适用性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 商品照片路径
     * @return photo 商品照片路径
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 商品照片路径
     * @param photo 商品照片路径
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 销售开始日
     * @return sale_begin 销售开始日
     */
    public Date getSaleBegin() {
        return saleBegin;
    }

    /**
     * 销售开始日
     * @param saleBegin 销售开始日
     */
    public void setSaleBegin(Date saleBegin) {
        this.saleBegin = saleBegin;
    }

    /**
     * 销售终了日
     * @return sale_end 销售终了日
     */
    public Date getSaleEnd() {
        return saleEnd;
    }

    /**
     * 销售终了日
     * @param saleEnd 销售终了日
     */
    public void setSaleEnd(Date saleEnd) {
        this.saleEnd = saleEnd;
    }

    /**
     * 单价
     * @return price 单价
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 单价
     * @param price 单价
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 削除フラグ
     * @return delete_flg 削除フラグ
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * 削除フラグ
     * @param deleteFlg 削除フラグ
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * 登録日時
     * @return create_time 登録日時
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 登録日時
     * @param createTime 登録日時
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 登録者
     * @return create_user_id 登録者
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 登録者
     * @param createUserId 登録者
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新日時
     * @return update_time 更新日時
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新日時
     * @param updateTime 更新日時
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新者
     * @return update_user_id 更新者
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新者
     * @param updateUserId 更新者
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}