package hci.artedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExperimentstepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperimentstepExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andEptIdIsNull() {
            addCriterion("eptId is null");
            return (Criteria) this;
        }

        public Criteria andEptIdIsNotNull() {
            addCriterion("eptId is not null");
            return (Criteria) this;
        }

        public Criteria andEptIdEqualTo(Integer value) {
            addCriterion("eptId =", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdNotEqualTo(Integer value) {
            addCriterion("eptId <>", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdGreaterThan(Integer value) {
            addCriterion("eptId >", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eptId >=", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdLessThan(Integer value) {
            addCriterion("eptId <", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdLessThanOrEqualTo(Integer value) {
            addCriterion("eptId <=", value, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdIn(List<Integer> values) {
            addCriterion("eptId in", values, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdNotIn(List<Integer> values) {
            addCriterion("eptId not in", values, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdBetween(Integer value1, Integer value2) {
            addCriterion("eptId between", value1, value2, "eptId");
            return (Criteria) this;
        }

        public Criteria andEptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eptId not between", value1, value2, "eptId");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNull() {
            addCriterion("stepNum is null");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNotNull() {
            addCriterion("stepNum is not null");
            return (Criteria) this;
        }

        public Criteria andStepNumEqualTo(Integer value) {
            addCriterion("stepNum =", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotEqualTo(Integer value) {
            addCriterion("stepNum <>", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThan(Integer value) {
            addCriterion("stepNum >", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stepNum >=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThan(Integer value) {
            addCriterion("stepNum <", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThanOrEqualTo(Integer value) {
            addCriterion("stepNum <=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumIn(List<Integer> values) {
            addCriterion("stepNum in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotIn(List<Integer> values) {
            addCriterion("stepNum not in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumBetween(Integer value1, Integer value2) {
            addCriterion("stepNum between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stepNum not between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNull() {
            addCriterion("stepName is null");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNotNull() {
            addCriterion("stepName is not null");
            return (Criteria) this;
        }

        public Criteria andStepNameEqualTo(String value) {
            addCriterion("stepName =", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotEqualTo(String value) {
            addCriterion("stepName <>", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThan(String value) {
            addCriterion("stepName >", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThanOrEqualTo(String value) {
            addCriterion("stepName >=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThan(String value) {
            addCriterion("stepName <", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThanOrEqualTo(String value) {
            addCriterion("stepName <=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLike(String value) {
            addCriterion("stepName like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotLike(String value) {
            addCriterion("stepName not like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameIn(List<String> values) {
            addCriterion("stepName in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotIn(List<String> values) {
            addCriterion("stepName not in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameBetween(String value1, String value2) {
            addCriterion("stepName between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotBetween(String value1, String value2) {
            addCriterion("stepName not between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepDesIsNull() {
            addCriterion("stepDes is null");
            return (Criteria) this;
        }

        public Criteria andStepDesIsNotNull() {
            addCriterion("stepDes is not null");
            return (Criteria) this;
        }

        public Criteria andStepDesEqualTo(String value) {
            addCriterion("stepDes =", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesNotEqualTo(String value) {
            addCriterion("stepDes <>", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesGreaterThan(String value) {
            addCriterion("stepDes >", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesGreaterThanOrEqualTo(String value) {
            addCriterion("stepDes >=", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesLessThan(String value) {
            addCriterion("stepDes <", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesLessThanOrEqualTo(String value) {
            addCriterion("stepDes <=", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesLike(String value) {
            addCriterion("stepDes like", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesNotLike(String value) {
            addCriterion("stepDes not like", value, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesIn(List<String> values) {
            addCriterion("stepDes in", values, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesNotIn(List<String> values) {
            addCriterion("stepDes not in", values, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesBetween(String value1, String value2) {
            addCriterion("stepDes between", value1, value2, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepDesNotBetween(String value1, String value2) {
            addCriterion("stepDes not between", value1, value2, "stepDes");
            return (Criteria) this;
        }

        public Criteria andStepPicIsNull() {
            addCriterion("stepPic is null");
            return (Criteria) this;
        }

        public Criteria andStepPicIsNotNull() {
            addCriterion("stepPic is not null");
            return (Criteria) this;
        }

        public Criteria andStepPicEqualTo(String value) {
            addCriterion("stepPic =", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicNotEqualTo(String value) {
            addCriterion("stepPic <>", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicGreaterThan(String value) {
            addCriterion("stepPic >", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicGreaterThanOrEqualTo(String value) {
            addCriterion("stepPic >=", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicLessThan(String value) {
            addCriterion("stepPic <", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicLessThanOrEqualTo(String value) {
            addCriterion("stepPic <=", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicLike(String value) {
            addCriterion("stepPic like", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicNotLike(String value) {
            addCriterion("stepPic not like", value, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicIn(List<String> values) {
            addCriterion("stepPic in", values, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicNotIn(List<String> values) {
            addCriterion("stepPic not in", values, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicBetween(String value1, String value2) {
            addCriterion("stepPic between", value1, value2, "stepPic");
            return (Criteria) this;
        }

        public Criteria andStepPicNotBetween(String value1, String value2) {
            addCriterion("stepPic not between", value1, value2, "stepPic");
            return (Criteria) this;
        }
    }

    /**
     */
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