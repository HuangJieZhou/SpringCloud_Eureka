package org.hjz.invoked01.common.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(BigDecimal value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(BigDecimal value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(BigDecimal value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(BigDecimal value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<BigDecimal> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<BigDecimal> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNull() {
            addCriterion("area_no is null");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNotNull() {
            addCriterion("area_no is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNoEqualTo(String value) {
            addCriterion("area_no =", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotEqualTo(String value) {
            addCriterion("area_no <>", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThan(String value) {
            addCriterion("area_no >", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("area_no >=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThan(String value) {
            addCriterion("area_no <", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThanOrEqualTo(String value) {
            addCriterion("area_no <=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLike(String value) {
            addCriterion("area_no like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotLike(String value) {
            addCriterion("area_no not like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoIn(List<String> values) {
            addCriterion("area_no in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotIn(List<String> values) {
            addCriterion("area_no not in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoBetween(String value1, String value2) {
            addCriterion("area_no between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotBetween(String value1, String value2) {
            addCriterion("area_no not between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNull() {
            addCriterion("area_type is null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNotNull() {
            addCriterion("area_type is not null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeEqualTo(String value) {
            addCriterion("area_type =", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotEqualTo(String value) {
            addCriterion("area_type <>", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThan(String value) {
            addCriterion("area_type >", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("area_type >=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThan(String value) {
            addCriterion("area_type <", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThanOrEqualTo(String value) {
            addCriterion("area_type <=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLike(String value) {
            addCriterion("area_type like", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotLike(String value) {
            addCriterion("area_type not like", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIn(List<String> values) {
            addCriterion("area_type in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotIn(List<String> values) {
            addCriterion("area_type not in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeBetween(String value1, String value2) {
            addCriterion("area_type between", value1, value2, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotBetween(String value1, String value2) {
            addCriterion("area_type not between", value1, value2, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaFidIsNull() {
            addCriterion("area_fid is null");
            return (Criteria) this;
        }

        public Criteria andAreaFidIsNotNull() {
            addCriterion("area_fid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaFidEqualTo(BigDecimal value) {
            addCriterion("area_fid =", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidNotEqualTo(BigDecimal value) {
            addCriterion("area_fid <>", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidGreaterThan(BigDecimal value) {
            addCriterion("area_fid >", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area_fid >=", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidLessThan(BigDecimal value) {
            addCriterion("area_fid <", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area_fid <=", value, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidIn(List<BigDecimal> values) {
            addCriterion("area_fid in", values, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidNotIn(List<BigDecimal> values) {
            addCriterion("area_fid not in", values, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_fid between", value1, value2, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaFidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_fid not between", value1, value2, "areaFid");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNull() {
            addCriterion("area_state is null");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNotNull() {
            addCriterion("area_state is not null");
            return (Criteria) this;
        }

        public Criteria andAreaStateEqualTo(String value) {
            addCriterion("area_state =", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotEqualTo(String value) {
            addCriterion("area_state <>", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThan(String value) {
            addCriterion("area_state >", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThanOrEqualTo(String value) {
            addCriterion("area_state >=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThan(String value) {
            addCriterion("area_state <", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThanOrEqualTo(String value) {
            addCriterion("area_state <=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLike(String value) {
            addCriterion("area_state like", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotLike(String value) {
            addCriterion("area_state not like", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateIn(List<String> values) {
            addCriterion("area_state in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotIn(List<String> values) {
            addCriterion("area_state not in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateBetween(String value1, String value2) {
            addCriterion("area_state between", value1, value2, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotBetween(String value1, String value2) {
            addCriterion("area_state not between", value1, value2, "areaState");
            return (Criteria) this;
        }

        public Criteria andClztIsNull() {
            addCriterion("clzt is null");
            return (Criteria) this;
        }

        public Criteria andClztIsNotNull() {
            addCriterion("clzt is not null");
            return (Criteria) this;
        }

        public Criteria andClztEqualTo(String value) {
            addCriterion("clzt =", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotEqualTo(String value) {
            addCriterion("clzt <>", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztGreaterThan(String value) {
            addCriterion("clzt >", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztGreaterThanOrEqualTo(String value) {
            addCriterion("clzt >=", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLessThan(String value) {
            addCriterion("clzt <", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLessThanOrEqualTo(String value) {
            addCriterion("clzt <=", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLike(String value) {
            addCriterion("clzt like", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotLike(String value) {
            addCriterion("clzt not like", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztIn(List<String> values) {
            addCriterion("clzt in", values, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotIn(List<String> values) {
            addCriterion("clzt not in", values, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztBetween(String value1, String value2) {
            addCriterion("clzt between", value1, value2, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotBetween(String value1, String value2) {
            addCriterion("clzt not between", value1, value2, "clzt");
            return (Criteria) this;
        }

        public Criteria andAreaSnoIsNull() {
            addCriterion("area_sno is null");
            return (Criteria) this;
        }

        public Criteria andAreaSnoIsNotNull() {
            addCriterion("area_sno is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSnoEqualTo(BigDecimal value) {
            addCriterion("area_sno =", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoNotEqualTo(BigDecimal value) {
            addCriterion("area_sno <>", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoGreaterThan(BigDecimal value) {
            addCriterion("area_sno >", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area_sno >=", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoLessThan(BigDecimal value) {
            addCriterion("area_sno <", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area_sno <=", value, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoIn(List<BigDecimal> values) {
            addCriterion("area_sno in", values, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoNotIn(List<BigDecimal> values) {
            addCriterion("area_sno not in", values, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_sno between", value1, value2, "areaSno");
            return (Criteria) this;
        }

        public Criteria andAreaSnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area_sno not between", value1, value2, "areaSno");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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