package com.baizhi.entity.original;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author li117
 * @date 2024/05/12 17:21:01
 * fruit 水果
 */
@Accessors(chain = true)
@Data
@Builder
@AllArgsConstructor
public class TFruitExample implements java.io.Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public TFruitExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andProductionIsNull() {
            addCriterion("production is null");
            return (Criteria) this;
        }

        public Criteria andProductionIsNotNull() {
            addCriterion("production is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEqualTo(Date value) {
            addCriterion("production =", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotEqualTo(Date value) {
            addCriterion("production <>", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThan(Date value) {
            addCriterion("production >", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThanOrEqualTo(Date value) {
            addCriterion("production >=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThan(Date value) {
            addCriterion("production <", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThanOrEqualTo(Date value) {
            addCriterion("production <=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionIn(List<Date> values) {
            addCriterion("production in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotIn(List<Date> values) {
            addCriterion("production not in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionBetween(Date value1, Date value2) {
            addCriterion("production between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotBetween(Date value1, Date value2) {
            addCriterion("production not between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andForeignTypeIsNull() {
            addCriterion("foreign_type is null");
            return (Criteria) this;
        }

        public Criteria andForeignTypeIsNotNull() {
            addCriterion("foreign_type is not null");
            return (Criteria) this;
        }

        public Criteria andForeignTypeEqualTo(String value) {
            addCriterion("foreign_type =", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeNotEqualTo(String value) {
            addCriterion("foreign_type <>", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeGreaterThan(String value) {
            addCriterion("foreign_type >", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_type >=", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeLessThan(String value) {
            addCriterion("foreign_type <", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeLessThanOrEqualTo(String value) {
            addCriterion("foreign_type <=", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeLike(String value) {
            addCriterion("foreign_type like", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeNotLike(String value) {
            addCriterion("foreign_type not like", value, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeIn(List<String> values) {
            addCriterion("foreign_type in", values, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeNotIn(List<String> values) {
            addCriterion("foreign_type not in", values, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeBetween(String value1, String value2) {
            addCriterion("foreign_type between", value1, value2, "foreignType");
            return (Criteria) this;
        }

        public Criteria andForeignTypeNotBetween(String value1, String value2) {
            addCriterion("foreign_type not between", value1, value2, "foreignType");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginIsNull() {
            addCriterion("country_of_origin is null");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginIsNotNull() {
            addCriterion("country_of_origin is not null");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginEqualTo(String value) {
            addCriterion("country_of_origin =", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginNotEqualTo(String value) {
            addCriterion("country_of_origin <>", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginGreaterThan(String value) {
            addCriterion("country_of_origin >", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginGreaterThanOrEqualTo(String value) {
            addCriterion("country_of_origin >=", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginLessThan(String value) {
            addCriterion("country_of_origin <", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginLessThanOrEqualTo(String value) {
            addCriterion("country_of_origin <=", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginLike(String value) {
            addCriterion("country_of_origin like", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginNotLike(String value) {
            addCriterion("country_of_origin not like", value, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginIn(List<String> values) {
            addCriterion("country_of_origin in", values, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginNotIn(List<String> values) {
            addCriterion("country_of_origin not in", values, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginBetween(String value1, String value2) {
            addCriterion("country_of_origin between", value1, value2, "countryOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCountryOfOriginNotBetween(String value1, String value2) {
            addCriterion("country_of_origin not between", value1, value2, "countryOfOrigin");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fruit
     *
     * @mbg.generated do_not_delete_during_merge Sun May 12 17:21:01 JST 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fruit
     *
     * @mbg.generated Sun May 12 17:21:01 JST 2024
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}