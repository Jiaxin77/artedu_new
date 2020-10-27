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

        public Criteria andEptnameIsNull() {
            addCriterion("eptName is null");
            return (Criteria) this;
        }

        public Criteria andEptnameIsNotNull() {
            addCriterion("eptName is not null");
            return (Criteria) this;
        }

        public Criteria andEptnameEqualTo(String value) {
            addCriterion("eptName =", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameNotEqualTo(String value) {
            addCriterion("eptName <>", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameGreaterThan(String value) {
            addCriterion("eptName >", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameGreaterThanOrEqualTo(String value) {
            addCriterion("eptName >=", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameLessThan(String value) {
            addCriterion("eptName <", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameLessThanOrEqualTo(String value) {
            addCriterion("eptName <=", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameLike(String value) {
            addCriterion("eptName like", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameNotLike(String value) {
            addCriterion("eptName not like", value, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameIn(List<String> values) {
            addCriterion("eptName in", values, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameNotIn(List<String> values) {
            addCriterion("eptName not in", values, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameBetween(String value1, String value2) {
            addCriterion("eptName between", value1, value2, "eptname");
            return (Criteria) this;
        }

        public Criteria andEptnameNotBetween(String value1, String value2) {
            addCriterion("eptName not between", value1, value2, "eptname");
            return (Criteria) this;
        }

        public Criteria andEpttimeIsNull() {
            addCriterion("eptTime is null");
            return (Criteria) this;
        }

        public Criteria andEpttimeIsNotNull() {
            addCriterion("eptTime is not null");
            return (Criteria) this;
        }

        public Criteria andEpttimeEqualTo(Long value) {
            addCriterion("eptTime =", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeNotEqualTo(Long value) {
            addCriterion("eptTime <>", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeGreaterThan(Long value) {
            addCriterion("eptTime >", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeGreaterThanOrEqualTo(Long value) {
            addCriterion("eptTime >=", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeLessThan(Long value) {
            addCriterion("eptTime <", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeLessThanOrEqualTo(Long value) {
            addCriterion("eptTime <=", value, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeIn(List<Long> values) {
            addCriterion("eptTime in", values, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeNotIn(List<Long> values) {
            addCriterion("eptTime not in", values, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeBetween(Long value1, Long value2) {
            addCriterion("eptTime between", value1, value2, "epttime");
            return (Criteria) this;
        }

        public Criteria andEpttimeNotBetween(Long value1, Long value2) {
            addCriterion("eptTime not between", value1, value2, "epttime");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeIsNull() {
            addCriterion("difficultDegree is null");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeIsNotNull() {
            addCriterion("difficultDegree is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeEqualTo(Integer value) {
            addCriterion("difficultDegree =", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeNotEqualTo(Integer value) {
            addCriterion("difficultDegree <>", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeGreaterThan(Integer value) {
            addCriterion("difficultDegree >", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficultDegree >=", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeLessThan(Integer value) {
            addCriterion("difficultDegree <", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeLessThanOrEqualTo(Integer value) {
            addCriterion("difficultDegree <=", value, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeIn(List<Integer> values) {
            addCriterion("difficultDegree in", values, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeNotIn(List<Integer> values) {
            addCriterion("difficultDegree not in", values, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeBetween(Integer value1, Integer value2) {
            addCriterion("difficultDegree between", value1, value2, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andDifficultdegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("difficultDegree not between", value1, value2, "difficultdegree");
            return (Criteria) this;
        }

        public Criteria andEpttypeIsNull() {
            addCriterion("eptType is null");
            return (Criteria) this;
        }

        public Criteria andEpttypeIsNotNull() {
            addCriterion("eptType is not null");
            return (Criteria) this;
        }

        public Criteria andEpttypeEqualTo(String value) {
            addCriterion("eptType =", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeNotEqualTo(String value) {
            addCriterion("eptType <>", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeGreaterThan(String value) {
            addCriterion("eptType >", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeGreaterThanOrEqualTo(String value) {
            addCriterion("eptType >=", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeLessThan(String value) {
            addCriterion("eptType <", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeLessThanOrEqualTo(String value) {
            addCriterion("eptType <=", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeLike(String value) {
            addCriterion("eptType like", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeNotLike(String value) {
            addCriterion("eptType not like", value, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeIn(List<String> values) {
            addCriterion("eptType in", values, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeNotIn(List<String> values) {
            addCriterion("eptType not in", values, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeBetween(String value1, String value2) {
            addCriterion("eptType between", value1, value2, "epttype");
            return (Criteria) this;
        }

        public Criteria andEpttypeNotBetween(String value1, String value2) {
            addCriterion("eptType not between", value1, value2, "epttype");
            return (Criteria) this;
        }

        public Criteria andPassrateIsNull() {
            addCriterion("passRate is null");
            return (Criteria) this;
        }

        public Criteria andPassrateIsNotNull() {
            addCriterion("passRate is not null");
            return (Criteria) this;
        }

        public Criteria andPassrateEqualTo(Integer value) {
            addCriterion("passRate =", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateNotEqualTo(Integer value) {
            addCriterion("passRate <>", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateGreaterThan(Integer value) {
            addCriterion("passRate >", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("passRate >=", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateLessThan(Integer value) {
            addCriterion("passRate <", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateLessThanOrEqualTo(Integer value) {
            addCriterion("passRate <=", value, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateIn(List<Integer> values) {
            addCriterion("passRate in", values, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateNotIn(List<Integer> values) {
            addCriterion("passRate not in", values, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateBetween(Integer value1, Integer value2) {
            addCriterion("passRate between", value1, value2, "passrate");
            return (Criteria) this;
        }

        public Criteria andPassrateNotBetween(Integer value1, Integer value2) {
            addCriterion("passRate not between", value1, value2, "passrate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateIsNull() {
            addCriterion("participateRate is null");
            return (Criteria) this;
        }

        public Criteria andParticipaterateIsNotNull() {
            addCriterion("participateRate is not null");
            return (Criteria) this;
        }

        public Criteria andParticipaterateEqualTo(Integer value) {
            addCriterion("participateRate =", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateNotEqualTo(Integer value) {
            addCriterion("participateRate <>", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateGreaterThan(Integer value) {
            addCriterion("participateRate >", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateGreaterThanOrEqualTo(Integer value) {
            addCriterion("participateRate >=", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateLessThan(Integer value) {
            addCriterion("participateRate <", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateLessThanOrEqualTo(Integer value) {
            addCriterion("participateRate <=", value, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateIn(List<Integer> values) {
            addCriterion("participateRate in", values, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateNotIn(List<Integer> values) {
            addCriterion("participateRate not in", values, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateBetween(Integer value1, Integer value2) {
            addCriterion("participateRate between", value1, value2, "participaterate");
            return (Criteria) this;
        }

        public Criteria andParticipaterateNotBetween(Integer value1, Integer value2) {
            addCriterion("participateRate not between", value1, value2, "participaterate");
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

        public Criteria andAllcoursetimeIsNull() {
            addCriterion("allCourseTime is null");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeIsNotNull() {
            addCriterion("allCourseTime is not null");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeEqualTo(Integer value) {
            addCriterion("allCourseTime =", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeNotEqualTo(Integer value) {
            addCriterion("allCourseTime <>", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeGreaterThan(Integer value) {
            addCriterion("allCourseTime >", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allCourseTime >=", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeLessThan(Integer value) {
            addCriterion("allCourseTime <", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeLessThanOrEqualTo(Integer value) {
            addCriterion("allCourseTime <=", value, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeIn(List<Integer> values) {
            addCriterion("allCourseTime in", values, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeNotIn(List<Integer> values) {
            addCriterion("allCourseTime not in", values, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeBetween(Integer value1, Integer value2) {
            addCriterion("allCourseTime between", value1, value2, "allcoursetime");
            return (Criteria) this;
        }

        public Criteria andAllcoursetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("allCourseTime not between", value1, value2, "allcoursetime");
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