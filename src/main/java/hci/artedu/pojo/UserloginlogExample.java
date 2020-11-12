package hci.artedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserloginlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserloginlogExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("beginTime <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("beginTime not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("endTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeIsNull() {
            addCriterion("duringTime is null");
            return (Criteria) this;
        }

        public Criteria andDuringTimeIsNotNull() {
            addCriterion("duringTime is not null");
            return (Criteria) this;
        }

        public Criteria andDuringTimeEqualTo(Date value) {
            addCriterionForJDBCTime("duringTime =", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("duringTime <>", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("duringTime >", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duringTime >=", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeLessThan(Date value) {
            addCriterionForJDBCTime("duringTime <", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duringTime <=", value, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeIn(List<Date> values) {
            addCriterionForJDBCTime("duringTime in", values, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("duringTime not in", values, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duringTime between", value1, value2, "duringTime");
            return (Criteria) this;
        }

        public Criteria andDuringTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duringTime not between", value1, value2, "duringTime");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("userIp is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("userIp is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("userIp =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("userIp <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("userIp >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("userIp >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("userIp <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("userIp <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("userIp like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("userIp not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("userIp in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("userIp not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("userIp between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("userIp not between", value1, value2, "userIp");
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