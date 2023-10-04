package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2023/10/04/09:41
 * uniqlo 优衣库
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Uniqlo implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.id
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.name
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.type
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.size
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.sex
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.photo
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.sale_begin
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Date saleBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.sale_end
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Date saleEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.price
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.delete_flg
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.create_time
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.create_user_id
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.update_time
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.update_user_id
     *
     * @mbg.generated Wed Oct 04 21:41:33 JST 2023
     */
    private String updateUserId;
}