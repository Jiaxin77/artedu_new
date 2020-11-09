package hci.artedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExperimentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperimentExample() {
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

        public Criteria andEptNameIsNull() {
            addCriterion("eptName is null");
            return (Criteria) this;
        }

        public Criteria andEptNameIsNotNull() {
            addCriterion("eptName is not null");
            return (Criteria) this;
        }

        public Criteria andEptNameEqualTo(String value) {
            addCriterion("eptName =", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameNotEqualTo(String value) {
            addCriterion("eptName <>", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameGreaterThan(String value) {
            addCriterion("eptName >", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameGreaterThanOrEqualTo(String value) {
            addCriterion("eptName >=", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameLessThan(String value) {
            addCriterion("eptName <", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameLessThanOrEqualTo(String value) {
            addCriterion("eptName <=", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameLike(String value) {
            addCriterion("eptName like", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameNotLike(String value) {
            addCriterion("eptName not like", value, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameIn(List<String> values) {
            addCriterion("eptName in", values, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameNotIn(List<String> values) {
            addCriterion("eptName not in", values, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameBetween(String value1, String value2) {
            addCriterion("eptName between", value1, value2, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptNameNotBetween(String value1, String value2) {
            addCriterion("eptName not between", value1, value2, "eptName");
            return (Criteria) this;
        }

        public Criteria andEptTimeIsNull() {
            addCriterion("eptTime is null");
            return (Criteria) this;
        }

        public Criteria andEptTimeIsNotNull() {
            addCriterion("eptTime is not null");
            return (Criteria) this;
        }

        public Criteria andEptTimeEqualTo(Long value) {
            addCriterion("eptTime =", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeNotEqualTo(Long value) {
            addCriterion("eptTime <>", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeGreaterThan(Long value) {
            addCriterion("eptTime >", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("eptTime >=", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeLessThan(Long value) {
            addCriterion("eptTime <", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeLessThanOrEqualTo(Long value) {
            addCriterion("eptTime <=", value, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeIn(List<Long> values) {
            addCriterion("eptTime in", values, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeNotIn(List<Long> values) {
            addCriterion("eptTime not in", values, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeBetween(Long value1, Long value2) {
            addCriterion("eptTime between", value1, value2, "eptTime");
            return (Criteria) this;
        }

        public Criteria andEptTimeNotBetween(Long value1, Long value2) {
            addCriterion("eptTime not between", value1, value2, "eptTime");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeIsNull() {
            addCriterion("difficultDegree is null");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeIsNotNull() {
            addCriterion("difficultDegree is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeEqualTo(Integer value) {
            addCriterion("difficultDegree =", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeNotEqualTo(Integer value) {
            addCriterion("difficultDegree <>", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeGreaterThan(Integer value) {
            addCriterion("difficultDegree >", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficultDegree >=", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeLessThan(Integer value) {
            addCriterion("difficultDegree <", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("difficultDegree <=", value, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeIn(List<Integer> values) {
            addCriterion("difficultDegree in", values, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeNotIn(List<Integer> values) {
            addCriterion("difficultDegree not in", values, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeBetween(Integer value1, Integer value2) {
            addCriterion("difficultDegree between", value1, value2, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andDifficultDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("difficultDegree not between", value1, value2, "difficultDegree");
            return (Criteria) this;
        }

        public Criteria andEptTypeIsNull() {
            addCriterion("eptType is null");
            return (Criteria) this;
        }

        public Criteria andEptTypeIsNotNull() {
            addCriterion("eptType is not null");
            return (Criteria) this;
        }

        public Criteria andEptTypeEqualTo(String value) {
            addCriterion("eptType =", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeNotEqualTo(String value) {
            addCriterion("eptType <>", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeGreaterThan(String value) {
            addCriterion("eptType >", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("eptType >=", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeLessThan(String value) {
            addCriterion("eptType <", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeLessThanOrEqualTo(String value) {
            addCriterion("eptType <=", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeLike(String value) {
            addCriterion("eptType like", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeNotLike(String value) {
            addCriterion("eptType not like", value, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeIn(List<String> values) {
            addCriterion("eptType in", values, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeNotIn(List<String> values) {
            addCriterion("eptType not in", values, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeBetween(String value1, String value2) {
            addCriterion("eptType between", value1, value2, "eptType");
            return (Criteria) this;
        }

        public Criteria andEptTypeNotBetween(String value1, String value2) {
            addCriterion("eptType not between", value1, value2, "eptType");
            return (Criteria) this;
        }

        public Criteria andPassRateIsNull() {
            addCriterion("passRate is null");
            return (Criteria) this;
        }

        public Criteria andPassRateIsNotNull() {
            addCriterion("passRate is not null");
            return (Criteria) this;
        }

        public Criteria andPassRateEqualTo(Integer value) {
            addCriterion("passRate =", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotEqualTo(Integer value) {
            addCriterion("passRate <>", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateGreaterThan(Integer value) {
            addCriterion("passRate >", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("passRate >=", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateLessThan(Integer value) {
            addCriterion("passRate <", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateLessThanOrEqualTo(Integer value) {
            addCriterion("passRate <=", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateIn(List<Integer> values) {
            addCriterion("passRate in", values, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotIn(List<Integer> values) {
            addCriterion("passRate not in", values, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateBetween(Integer value1, Integer value2) {
            addCriterion("passRate between", value1, value2, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotBetween(Integer value1, Integer value2) {
            addCriterion("passRate not between", value1, value2, "passRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateIsNull() {
            addCriterion("participateRate is null");
            return (Criteria) this;
        }

        public Criteria andParticipateRateIsNotNull() {
            addCriterion("participateRate is not null");
            return (Criteria) this;
        }

        public Criteria andParticipateRateEqualTo(Integer value) {
            addCriterion("participateRate =", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateNotEqualTo(Integer value) {
            addCriterion("participateRate <>", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateGreaterThan(Integer value) {
            addCriterion("participateRate >", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("participateRate >=", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateLessThan(Integer value) {
            addCriterion("participateRate <", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateLessThanOrEqualTo(Integer value) {
            addCriterion("participateRate <=", value, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateIn(List<Integer> values) {
            addCriterion("participateRate in", values, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateNotIn(List<Integer> values) {
            addCriterion("participateRate not in", values, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateBetween(Integer value1, Integer value2) {
            addCriterion("participateRate between", value1, value2, "participateRate");
            return (Criteria) this;
        }

        public Criteria andParticipateRateNotBetween(Integer value1, Integer value2) {
            addCriterion("participateRate not between", value1, value2, "participateRate");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeIsNull() {
            addCriterion("allCourseTime is null");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeIsNotNull() {
            addCriterion("allCourseTime is not null");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeEqualTo(Integer value) {
            addCriterion("allCourseTime =", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeNotEqualTo(Integer value) {
            addCriterion("allCourseTime <>", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeGreaterThan(Integer value) {
            addCriterion("allCourseTime >", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allCourseTime >=", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeLessThan(Integer value) {
            addCriterion("allCourseTime <", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("allCourseTime <=", value, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeIn(List<Integer> values) {
            addCriterion("allCourseTime in", values, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeNotIn(List<Integer> values) {
            addCriterion("allCourseTime not in", values, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeBetween(Integer value1, Integer value2) {
            addCriterion("allCourseTime between", value1, value2, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andAllCourseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("allCourseTime not between", value1, value2, "allCourseTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andPrincipleIsNull() {
            addCriterion("principle is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleIsNotNull() {
            addCriterion("principle is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleEqualTo(String value) {
            addCriterion("principle =", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotEqualTo(String value) {
            addCriterion("principle <>", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleGreaterThan(String value) {
            addCriterion("principle >", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleGreaterThanOrEqualTo(String value) {
            addCriterion("principle >=", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLessThan(String value) {
            addCriterion("principle <", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLessThanOrEqualTo(String value) {
            addCriterion("principle <=", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleLike(String value) {
            addCriterion("principle like", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotLike(String value) {
            addCriterion("principle not like", value, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleIn(List<String> values) {
            addCriterion("principle in", values, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotIn(List<String> values) {
            addCriterion("principle not in", values, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleBetween(String value1, String value2) {
            addCriterion("principle between", value1, value2, "principle");
            return (Criteria) this;
        }

        public Criteria andPrincipleNotBetween(String value1, String value2) {
            addCriterion("principle not between", value1, value2, "principle");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("`method` is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("`method` is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("`method` =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("`method` <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("`method` >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("`method` >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("`method` <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("`method` <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("`method` like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("`method` not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("`method` in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("`method` not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("`method` between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("`method` not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andStepsIsNull() {
            addCriterion("steps is null");
            return (Criteria) this;
        }

        public Criteria andStepsIsNotNull() {
            addCriterion("steps is not null");
            return (Criteria) this;
        }

        public Criteria andStepsEqualTo(String value) {
            addCriterion("steps =", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotEqualTo(String value) {
            addCriterion("steps <>", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThan(String value) {
            addCriterion("steps >", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThanOrEqualTo(String value) {
            addCriterion("steps >=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThan(String value) {
            addCriterion("steps <", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThanOrEqualTo(String value) {
            addCriterion("steps <=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLike(String value) {
            addCriterion("steps like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotLike(String value) {
            addCriterion("steps not like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsIn(List<String> values) {
            addCriterion("steps in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotIn(List<String> values) {
            addCriterion("steps not in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsBetween(String value1, String value2) {
            addCriterion("steps between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotBetween(String value1, String value2) {
            addCriterion("steps not between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNull() {
            addCriterion("coverPic is null");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNotNull() {
            addCriterion("coverPic is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPicEqualTo(String value) {
            addCriterion("coverPic =", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotEqualTo(String value) {
            addCriterion("coverPic <>", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThan(String value) {
            addCriterion("coverPic >", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThanOrEqualTo(String value) {
            addCriterion("coverPic >=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThan(String value) {
            addCriterion("coverPic <", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThanOrEqualTo(String value) {
            addCriterion("coverPic <=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLike(String value) {
            addCriterion("coverPic like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotLike(String value) {
            addCriterion("coverPic not like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicIn(List<String> values) {
            addCriterion("coverPic in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotIn(List<String> values) {
            addCriterion("coverPic not in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicBetween(String value1, String value2) {
            addCriterion("coverPic between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotBetween(String value1, String value2) {
            addCriterion("coverPic not between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andPurposePicIsNull() {
            addCriterion("purposePic is null");
            return (Criteria) this;
        }

        public Criteria andPurposePicIsNotNull() {
            addCriterion("purposePic is not null");
            return (Criteria) this;
        }

        public Criteria andPurposePicEqualTo(String value) {
            addCriterion("purposePic =", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicNotEqualTo(String value) {
            addCriterion("purposePic <>", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicGreaterThan(String value) {
            addCriterion("purposePic >", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicGreaterThanOrEqualTo(String value) {
            addCriterion("purposePic >=", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicLessThan(String value) {
            addCriterion("purposePic <", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicLessThanOrEqualTo(String value) {
            addCriterion("purposePic <=", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicLike(String value) {
            addCriterion("purposePic like", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicNotLike(String value) {
            addCriterion("purposePic not like", value, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicIn(List<String> values) {
            addCriterion("purposePic in", values, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicNotIn(List<String> values) {
            addCriterion("purposePic not in", values, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicBetween(String value1, String value2) {
            addCriterion("purposePic between", value1, value2, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPurposePicNotBetween(String value1, String value2) {
            addCriterion("purposePic not between", value1, value2, "purposePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicIsNull() {
            addCriterion("principlePic is null");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicIsNotNull() {
            addCriterion("principlePic is not null");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicEqualTo(String value) {
            addCriterion("principlePic =", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicNotEqualTo(String value) {
            addCriterion("principlePic <>", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicGreaterThan(String value) {
            addCriterion("principlePic >", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicGreaterThanOrEqualTo(String value) {
            addCriterion("principlePic >=", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicLessThan(String value) {
            addCriterion("principlePic <", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicLessThanOrEqualTo(String value) {
            addCriterion("principlePic <=", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicLike(String value) {
            addCriterion("principlePic like", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicNotLike(String value) {
            addCriterion("principlePic not like", value, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicIn(List<String> values) {
            addCriterion("principlePic in", values, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicNotIn(List<String> values) {
            addCriterion("principlePic not in", values, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicBetween(String value1, String value2) {
            addCriterion("principlePic between", value1, value2, "principlePic");
            return (Criteria) this;
        }

        public Criteria andPrinciplePicNotBetween(String value1, String value2) {
            addCriterion("principlePic not between", value1, value2, "principlePic");
            return (Criteria) this;
        }

        public Criteria andMethodPicIsNull() {
            addCriterion("methodPic is null");
            return (Criteria) this;
        }

        public Criteria andMethodPicIsNotNull() {
            addCriterion("methodPic is not null");
            return (Criteria) this;
        }

        public Criteria andMethodPicEqualTo(String value) {
            addCriterion("methodPic =", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicNotEqualTo(String value) {
            addCriterion("methodPic <>", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicGreaterThan(String value) {
            addCriterion("methodPic >", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicGreaterThanOrEqualTo(String value) {
            addCriterion("methodPic >=", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicLessThan(String value) {
            addCriterion("methodPic <", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicLessThanOrEqualTo(String value) {
            addCriterion("methodPic <=", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicLike(String value) {
            addCriterion("methodPic like", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicNotLike(String value) {
            addCriterion("methodPic not like", value, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicIn(List<String> values) {
            addCriterion("methodPic in", values, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicNotIn(List<String> values) {
            addCriterion("methodPic not in", values, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicBetween(String value1, String value2) {
            addCriterion("methodPic between", value1, value2, "methodPic");
            return (Criteria) this;
        }

        public Criteria andMethodPicNotBetween(String value1, String value2) {
            addCriterion("methodPic not between", value1, value2, "methodPic");
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

        public Criteria andDevicePicIsNull() {
            addCriterion("devicePic is null");
            return (Criteria) this;
        }

        public Criteria andDevicePicIsNotNull() {
            addCriterion("devicePic is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePicEqualTo(String value) {
            addCriterion("devicePic =", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicNotEqualTo(String value) {
            addCriterion("devicePic <>", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicGreaterThan(String value) {
            addCriterion("devicePic >", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicGreaterThanOrEqualTo(String value) {
            addCriterion("devicePic >=", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicLessThan(String value) {
            addCriterion("devicePic <", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicLessThanOrEqualTo(String value) {
            addCriterion("devicePic <=", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicLike(String value) {
            addCriterion("devicePic like", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicNotLike(String value) {
            addCriterion("devicePic not like", value, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicIn(List<String> values) {
            addCriterion("devicePic in", values, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicNotIn(List<String> values) {
            addCriterion("devicePic not in", values, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicBetween(String value1, String value2) {
            addCriterion("devicePic between", value1, value2, "devicePic");
            return (Criteria) this;
        }

        public Criteria andDevicePicNotBetween(String value1, String value2) {
            addCriterion("devicePic not between", value1, value2, "devicePic");
            return (Criteria) this;
        }

        public Criteria andScanNumIsNull() {
            addCriterion("scanNum is null");
            return (Criteria) this;
        }

        public Criteria andScanNumIsNotNull() {
            addCriterion("scanNum is not null");
            return (Criteria) this;
        }

        public Criteria andScanNumEqualTo(Integer value) {
            addCriterion("scanNum =", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumNotEqualTo(Integer value) {
            addCriterion("scanNum <>", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumGreaterThan(Integer value) {
            addCriterion("scanNum >", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("scanNum >=", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumLessThan(Integer value) {
            addCriterion("scanNum <", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumLessThanOrEqualTo(Integer value) {
            addCriterion("scanNum <=", value, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumIn(List<Integer> values) {
            addCriterion("scanNum in", values, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumNotIn(List<Integer> values) {
            addCriterion("scanNum not in", values, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumBetween(Integer value1, Integer value2) {
            addCriterion("scanNum between", value1, value2, "scanNum");
            return (Criteria) this;
        }

        public Criteria andScanNumNotBetween(Integer value1, Integer value2) {
            addCriterion("scanNum not between", value1, value2, "scanNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNull() {
            addCriterion("knowledgePoint is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNotNull() {
            addCriterion("knowledgePoint is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointEqualTo(String value) {
            addCriterion("knowledgePoint =", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotEqualTo(String value) {
            addCriterion("knowledgePoint <>", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThan(String value) {
            addCriterion("knowledgePoint >", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThanOrEqualTo(String value) {
            addCriterion("knowledgePoint >=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThan(String value) {
            addCriterion("knowledgePoint <", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThanOrEqualTo(String value) {
            addCriterion("knowledgePoint <=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLike(String value) {
            addCriterion("knowledgePoint like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotLike(String value) {
            addCriterion("knowledgePoint not like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIn(List<String> values) {
            addCriterion("knowledgePoint in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotIn(List<String> values) {
            addCriterion("knowledgePoint not in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointBetween(String value1, String value2) {
            addCriterion("knowledgePoint between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotBetween(String value1, String value2) {
            addCriterion("knowledgePoint not between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("englishName is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("englishName is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("englishName =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("englishName <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("englishName >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("englishName >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("englishName <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("englishName <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("englishName like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("englishName not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("englishName in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("englishName not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("englishName between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("englishName not between", value1, value2, "englishName");
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