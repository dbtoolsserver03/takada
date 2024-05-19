package com.baizhi.entity.original;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2024/05/12 16:12:58
 * house 賃貸住宅
 */
@Accessors(chain = true)
@Data
@Builder
@AllArgsConstructor
public class ThouseExample implements java.io.Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public ThouseExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
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
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
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

        public Criteria andRentFeeIsNull() {
            addCriterion("rent_fee is null");
            return (Criteria) this;
        }

        public Criteria andRentFeeIsNotNull() {
            addCriterion("rent_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRentFeeEqualTo(Double value) {
            addCriterion("rent_fee =", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotEqualTo(Double value) {
            addCriterion("rent_fee <>", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeGreaterThan(Double value) {
            addCriterion("rent_fee >", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("rent_fee >=", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeLessThan(Double value) {
            addCriterion("rent_fee <", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeLessThanOrEqualTo(Double value) {
            addCriterion("rent_fee <=", value, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeIn(List<Double> values) {
            addCriterion("rent_fee in", values, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotIn(List<Double> values) {
            addCriterion("rent_fee not in", values, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeBetween(Double value1, Double value2) {
            addCriterion("rent_fee between", value1, value2, "rentFee");
            return (Criteria) this;
        }

        public Criteria andRentFeeNotBetween(Double value1, Double value2) {
            addCriterion("rent_fee not between", value1, value2, "rentFee");
            return (Criteria) this;
        }

        public Criteria andHouseBilldIsNull() {
            addCriterion("house_billd is null");
            return (Criteria) this;
        }

        public Criteria andHouseBilldIsNotNull() {
            addCriterion("house_billd is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBilldEqualTo(Date value) {
            addCriterion("house_billd =", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldNotEqualTo(Date value) {
            addCriterion("house_billd <>", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldGreaterThan(Date value) {
            addCriterion("house_billd >", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldGreaterThanOrEqualTo(Date value) {
            addCriterion("house_billd >=", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldLessThan(Date value) {
            addCriterion("house_billd <", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldLessThanOrEqualTo(Date value) {
            addCriterion("house_billd <=", value, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldIn(List<Date> values) {
            addCriterion("house_billd in", values, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldNotIn(List<Date> values) {
            addCriterion("house_billd not in", values, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldBetween(Date value1, Date value2) {
            addCriterion("house_billd between", value1, value2, "houseBilld");
            return (Criteria) this;
        }

        public Criteria andHouseBilldNotBetween(Date value1, Date value2) {
            addCriterion("house_billd not between", value1, value2, "houseBilld");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andAddresIsNull() {
            addCriterion("addres is null");
            return (Criteria) this;
        }

        public Criteria andAddresIsNotNull() {
            addCriterion("addres is not null");
            return (Criteria) this;
        }

        public Criteria andAddresEqualTo(String value) {
            addCriterion("addres =", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotEqualTo(String value) {
            addCriterion("addres <>", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresGreaterThan(String value) {
            addCriterion("addres >", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresGreaterThanOrEqualTo(String value) {
            addCriterion("addres >=", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLessThan(String value) {
            addCriterion("addres <", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLessThanOrEqualTo(String value) {
            addCriterion("addres <=", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLike(String value) {
            addCriterion("addres like", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotLike(String value) {
            addCriterion("addres not like", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresIn(List<String> values) {
            addCriterion("addres in", values, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotIn(List<String> values) {
            addCriterion("addres not in", values, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresBetween(String value1, String value2) {
            addCriterion("addres between", value1, value2, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotBetween(String value1, String value2) {
            addCriterion("addres not between", value1, value2, "addres");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated do_not_delete_during_merge Sun May 12 16:12:58 JST 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table house
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
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