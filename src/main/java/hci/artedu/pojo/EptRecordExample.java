package hci.artedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EptRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EptRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andDurTimeIsNull() {
            addCriterion("durTime is null");
            return (Criteria) this;
        }

        public Criteria andDurTimeIsNotNull() {
            addCriterion("durTime is not null");
            return (Criteria) this;
        }

        public Criteria andDurTimeEqualTo(Date value) {
            addCriterionForJDBCTime("durTime =", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("durTime <>", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("durTime >", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("durTime >=", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeLessThan(Date value) {
            addCriterionForJDBCTime("durTime <", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("durTime <=", value, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeIn(List<Date> values) {
            addCriterionForJDBCTime("durTime in", values, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("durTime not in", values, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("durTime between", value1, value2, "durTime");
            return (Criteria) this;
        }

        public Criteria andDurTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("durTime not between", value1, value2, "durTime");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIsNull() {
            addCriterion("difficultyLevel is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIsNotNull() {
            addCriterion("difficultyLevel is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelEqualTo(Integer value) {
            addCriterion("difficultyLevel =", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotEqualTo(Integer value) {
            addCriterion("difficultyLevel <>", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelGreaterThan(Integer value) {
            addCriterion("difficultyLevel >", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficultyLevel >=", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelLessThan(Integer value) {
            addCriterion("difficultyLevel <", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("difficultyLevel <=", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIn(List<Integer> values) {
            addCriterion("difficultyLevel in", values, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotIn(List<Integer> values) {
            addCriterion("difficultyLevel not in", values, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelBetween(Integer value1, Integer value2) {
            addCriterion("difficultyLevel between", value1, value2, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("difficultyLevel not between", value1, value2, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIsNull() {
            addCriterion("exerciseLevel is null");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIsNotNull() {
            addCriterion("exerciseLevel is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelEqualTo(Integer value) {
            addCriterion("exerciseLevel =", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotEqualTo(Integer value) {
            addCriterion("exerciseLevel <>", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelGreaterThan(Integer value) {
            addCriterion("exerciseLevel >", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("exerciseLevel >=", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelLessThan(Integer value) {
            addCriterion("exerciseLevel <", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelLessThanOrEqualTo(Integer value) {
            addCriterion("exerciseLevel <=", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIn(List<Integer> values) {
            addCriterion("exerciseLevel in", values, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotIn(List<Integer> values) {
            addCriterion("exerciseLevel not in", values, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelBetween(Integer value1, Integer value2) {
            addCriterion("exerciseLevel between", value1, value2, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("exerciseLevel not between", value1, value2, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelIsNull() {
            addCriterion("masteryLevel is null");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelIsNotNull() {
            addCriterion("masteryLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelEqualTo(Integer value) {
            addCriterion("masteryLevel =", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelNotEqualTo(Integer value) {
            addCriterion("masteryLevel <>", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelGreaterThan(Integer value) {
            addCriterion("masteryLevel >", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("masteryLevel >=", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelLessThan(Integer value) {
            addCriterion("masteryLevel <", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("masteryLevel <=", value, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelIn(List<Integer> values) {
            addCriterion("masteryLevel in", values, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelNotIn(List<Integer> values) {
            addCriterion("masteryLevel not in", values, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelBetween(Integer value1, Integer value2) {
            addCriterion("masteryLevel between", value1, value2, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andMasteryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("masteryLevel not between", value1, value2, "masteryLevel");
            return (Criteria) this;
        }

        public Criteria andEptDateIsNull() {
            addCriterion("eptDate is null");
            return (Criteria) this;
        }

        public Criteria andEptDateIsNotNull() {
            addCriterion("eptDate is not null");
            return (Criteria) this;
        }

        public Criteria andEptDateEqualTo(Date value) {
            addCriterionForJDBCDate("eptDate =", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("eptDate <>", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateGreaterThan(Date value) {
            addCriterionForJDBCDate("eptDate >", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eptDate >=", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateLessThan(Date value) {
            addCriterionForJDBCDate("eptDate <", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eptDate <=", value, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateIn(List<Date> values) {
            addCriterionForJDBCDate("eptDate in", values, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("eptDate not in", values, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eptDate between", value1, value2, "eptDate");
            return (Criteria) this;
        }

        public Criteria andEptDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eptDate not between", value1, value2, "eptDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
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