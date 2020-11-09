package hci.artedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
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

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("`number` like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("`number` not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStudyScoreIsNull() {
            addCriterion("studyScore is null");
            return (Criteria) this;
        }

        public Criteria andStudyScoreIsNotNull() {
            addCriterion("studyScore is not null");
            return (Criteria) this;
        }

        public Criteria andStudyScoreEqualTo(Integer value) {
            addCriterion("studyScore =", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreNotEqualTo(Integer value) {
            addCriterion("studyScore <>", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreGreaterThan(Integer value) {
            addCriterion("studyScore >", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyScore >=", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreLessThan(Integer value) {
            addCriterion("studyScore <", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreLessThanOrEqualTo(Integer value) {
            addCriterion("studyScore <=", value, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreIn(List<Integer> values) {
            addCriterion("studyScore in", values, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreNotIn(List<Integer> values) {
            addCriterion("studyScore not in", values, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreBetween(Integer value1, Integer value2) {
            addCriterion("studyScore between", value1, value2, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("studyScore not between", value1, value2, "studyScore");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIsNull() {
            addCriterion("studyTime is null");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIsNotNull() {
            addCriterion("studyTime is not null");
            return (Criteria) this;
        }

        public Criteria andStudyTimeEqualTo(Integer value) {
            addCriterion("studyTime =", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotEqualTo(Integer value) {
            addCriterion("studyTime <>", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeGreaterThan(Integer value) {
            addCriterion("studyTime >", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyTime >=", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeLessThan(Integer value) {
            addCriterion("studyTime <", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("studyTime <=", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIn(List<Integer> values) {
            addCriterion("studyTime in", values, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotIn(List<Integer> values) {
            addCriterion("studyTime not in", values, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeBetween(Integer value1, Integer value2) {
            addCriterion("studyTime between", value1, value2, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("studyTime not between", value1, value2, "studyTime");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNull() {
            addCriterion("isMust is null");
            return (Criteria) this;
        }

        public Criteria andIsMustIsNotNull() {
            addCriterion("isMust is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustEqualTo(Boolean value) {
            addCriterion("isMust =", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotEqualTo(Boolean value) {
            addCriterion("isMust <>", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThan(Boolean value) {
            addCriterion("isMust >", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMust >=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThan(Boolean value) {
            addCriterion("isMust <", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustLessThanOrEqualTo(Boolean value) {
            addCriterion("isMust <=", value, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustIn(List<Boolean> values) {
            addCriterion("isMust in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotIn(List<Boolean> values) {
            addCriterion("isMust not in", values, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustBetween(Boolean value1, Boolean value2) {
            addCriterion("isMust between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andIsMustNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMust not between", value1, value2, "isMust");
            return (Criteria) this;
        }

        public Criteria andOpenTermIsNull() {
            addCriterion("openTerm is null");
            return (Criteria) this;
        }

        public Criteria andOpenTermIsNotNull() {
            addCriterion("openTerm is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTermEqualTo(String value) {
            addCriterion("openTerm =", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermNotEqualTo(String value) {
            addCriterion("openTerm <>", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermGreaterThan(String value) {
            addCriterion("openTerm >", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermGreaterThanOrEqualTo(String value) {
            addCriterion("openTerm >=", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermLessThan(String value) {
            addCriterion("openTerm <", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermLessThanOrEqualTo(String value) {
            addCriterion("openTerm <=", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermLike(String value) {
            addCriterion("openTerm like", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermNotLike(String value) {
            addCriterion("openTerm not like", value, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermIn(List<String> values) {
            addCriterion("openTerm in", values, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermNotIn(List<String> values) {
            addCriterion("openTerm not in", values, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermBetween(String value1, String value2) {
            addCriterion("openTerm between", value1, value2, "openTerm");
            return (Criteria) this;
        }

        public Criteria andOpenTermNotBetween(String value1, String value2) {
            addCriterion("openTerm not between", value1, value2, "openTerm");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseIsNull() {
            addCriterion("beforeCourse is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseIsNotNull() {
            addCriterion("beforeCourse is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseEqualTo(String value) {
            addCriterion("beforeCourse =", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseNotEqualTo(String value) {
            addCriterion("beforeCourse <>", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseGreaterThan(String value) {
            addCriterion("beforeCourse >", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseGreaterThanOrEqualTo(String value) {
            addCriterion("beforeCourse >=", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseLessThan(String value) {
            addCriterion("beforeCourse <", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseLessThanOrEqualTo(String value) {
            addCriterion("beforeCourse <=", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseLike(String value) {
            addCriterion("beforeCourse like", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseNotLike(String value) {
            addCriterion("beforeCourse not like", value, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseIn(List<String> values) {
            addCriterion("beforeCourse in", values, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseNotIn(List<String> values) {
            addCriterion("beforeCourse not in", values, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseBetween(String value1, String value2) {
            addCriterion("beforeCourse between", value1, value2, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andBeforeCourseNotBetween(String value1, String value2) {
            addCriterion("beforeCourse not between", value1, value2, "beforeCourse");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTitle_oneIsNull() {
            addCriterion("title_one is null");
            return (Criteria) this;
        }

        public Criteria andTitle_oneIsNotNull() {
            addCriterion("title_one is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_oneEqualTo(String value) {
            addCriterion("title_one =", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneNotEqualTo(String value) {
            addCriterion("title_one <>", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneGreaterThan(String value) {
            addCriterion("title_one >", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneGreaterThanOrEqualTo(String value) {
            addCriterion("title_one >=", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneLessThan(String value) {
            addCriterion("title_one <", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneLessThanOrEqualTo(String value) {
            addCriterion("title_one <=", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneLike(String value) {
            addCriterion("title_one like", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneNotLike(String value) {
            addCriterion("title_one not like", value, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneIn(List<String> values) {
            addCriterion("title_one in", values, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneNotIn(List<String> values) {
            addCriterion("title_one not in", values, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneBetween(String value1, String value2) {
            addCriterion("title_one between", value1, value2, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_oneNotBetween(String value1, String value2) {
            addCriterion("title_one not between", value1, value2, "title_one");
            return (Criteria) this;
        }

        public Criteria andTitle_twoIsNull() {
            addCriterion("title_two is null");
            return (Criteria) this;
        }

        public Criteria andTitle_twoIsNotNull() {
            addCriterion("title_two is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_twoEqualTo(String value) {
            addCriterion("title_two =", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoNotEqualTo(String value) {
            addCriterion("title_two <>", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoGreaterThan(String value) {
            addCriterion("title_two >", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoGreaterThanOrEqualTo(String value) {
            addCriterion("title_two >=", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoLessThan(String value) {
            addCriterion("title_two <", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoLessThanOrEqualTo(String value) {
            addCriterion("title_two <=", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoLike(String value) {
            addCriterion("title_two like", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoNotLike(String value) {
            addCriterion("title_two not like", value, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoIn(List<String> values) {
            addCriterion("title_two in", values, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoNotIn(List<String> values) {
            addCriterion("title_two not in", values, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoBetween(String value1, String value2) {
            addCriterion("title_two between", value1, value2, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_twoNotBetween(String value1, String value2) {
            addCriterion("title_two not between", value1, value2, "title_two");
            return (Criteria) this;
        }

        public Criteria andTitle_threeIsNull() {
            addCriterion("title_three is null");
            return (Criteria) this;
        }

        public Criteria andTitle_threeIsNotNull() {
            addCriterion("title_three is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_threeEqualTo(String value) {
            addCriterion("title_three =", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeNotEqualTo(String value) {
            addCriterion("title_three <>", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeGreaterThan(String value) {
            addCriterion("title_three >", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeGreaterThanOrEqualTo(String value) {
            addCriterion("title_three >=", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeLessThan(String value) {
            addCriterion("title_three <", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeLessThanOrEqualTo(String value) {
            addCriterion("title_three <=", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeLike(String value) {
            addCriterion("title_three like", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeNotLike(String value) {
            addCriterion("title_three not like", value, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeIn(List<String> values) {
            addCriterion("title_three in", values, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeNotIn(List<String> values) {
            addCriterion("title_three not in", values, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeBetween(String value1, String value2) {
            addCriterion("title_three between", value1, value2, "title_three");
            return (Criteria) this;
        }

        public Criteria andTitle_threeNotBetween(String value1, String value2) {
            addCriterion("title_three not between", value1, value2, "title_three");
            return (Criteria) this;
        }

        public Criteria andContent_oneIsNull() {
            addCriterion("content_one is null");
            return (Criteria) this;
        }

        public Criteria andContent_oneIsNotNull() {
            addCriterion("content_one is not null");
            return (Criteria) this;
        }

        public Criteria andContent_oneEqualTo(String value) {
            addCriterion("content_one =", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneNotEqualTo(String value) {
            addCriterion("content_one <>", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneGreaterThan(String value) {
            addCriterion("content_one >", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneGreaterThanOrEqualTo(String value) {
            addCriterion("content_one >=", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneLessThan(String value) {
            addCriterion("content_one <", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneLessThanOrEqualTo(String value) {
            addCriterion("content_one <=", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneLike(String value) {
            addCriterion("content_one like", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneNotLike(String value) {
            addCriterion("content_one not like", value, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneIn(List<String> values) {
            addCriterion("content_one in", values, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneNotIn(List<String> values) {
            addCriterion("content_one not in", values, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneBetween(String value1, String value2) {
            addCriterion("content_one between", value1, value2, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_oneNotBetween(String value1, String value2) {
            addCriterion("content_one not between", value1, value2, "content_one");
            return (Criteria) this;
        }

        public Criteria andContent_twoIsNull() {
            addCriterion("content_two is null");
            return (Criteria) this;
        }

        public Criteria andContent_twoIsNotNull() {
            addCriterion("content_two is not null");
            return (Criteria) this;
        }

        public Criteria andContent_twoEqualTo(String value) {
            addCriterion("content_two =", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoNotEqualTo(String value) {
            addCriterion("content_two <>", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoGreaterThan(String value) {
            addCriterion("content_two >", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoGreaterThanOrEqualTo(String value) {
            addCriterion("content_two >=", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoLessThan(String value) {
            addCriterion("content_two <", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoLessThanOrEqualTo(String value) {
            addCriterion("content_two <=", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoLike(String value) {
            addCriterion("content_two like", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoNotLike(String value) {
            addCriterion("content_two not like", value, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoIn(List<String> values) {
            addCriterion("content_two in", values, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoNotIn(List<String> values) {
            addCriterion("content_two not in", values, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoBetween(String value1, String value2) {
            addCriterion("content_two between", value1, value2, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_twoNotBetween(String value1, String value2) {
            addCriterion("content_two not between", value1, value2, "content_two");
            return (Criteria) this;
        }

        public Criteria andContent_threeIsNull() {
            addCriterion("content_three is null");
            return (Criteria) this;
        }

        public Criteria andContent_threeIsNotNull() {
            addCriterion("content_three is not null");
            return (Criteria) this;
        }

        public Criteria andContent_threeEqualTo(String value) {
            addCriterion("content_three =", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeNotEqualTo(String value) {
            addCriterion("content_three <>", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeGreaterThan(String value) {
            addCriterion("content_three >", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeGreaterThanOrEqualTo(String value) {
            addCriterion("content_three >=", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeLessThan(String value) {
            addCriterion("content_three <", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeLessThanOrEqualTo(String value) {
            addCriterion("content_three <=", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeLike(String value) {
            addCriterion("content_three like", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeNotLike(String value) {
            addCriterion("content_three not like", value, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeIn(List<String> values) {
            addCriterion("content_three in", values, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeNotIn(List<String> values) {
            addCriterion("content_three not in", values, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeBetween(String value1, String value2) {
            addCriterion("content_three between", value1, value2, "content_three");
            return (Criteria) this;
        }

        public Criteria andContent_threeNotBetween(String value1, String value2) {
            addCriterion("content_three not between", value1, value2, "content_three");
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