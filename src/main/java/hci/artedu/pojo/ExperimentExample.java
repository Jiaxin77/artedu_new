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

        public Criteria andDiffucultLevelIsNull() {
            addCriterion("diffucultLevel is null");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelIsNotNull() {
            addCriterion("diffucultLevel is not null");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelEqualTo(String value) {
            addCriterion("diffucultLevel =", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelNotEqualTo(String value) {
            addCriterion("diffucultLevel <>", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelGreaterThan(String value) {
            addCriterion("diffucultLevel >", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelGreaterThanOrEqualTo(String value) {
            addCriterion("diffucultLevel >=", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelLessThan(String value) {
            addCriterion("diffucultLevel <", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelLessThanOrEqualTo(String value) {
            addCriterion("diffucultLevel <=", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelLike(String value) {
            addCriterion("diffucultLevel like", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelNotLike(String value) {
            addCriterion("diffucultLevel not like", value, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelIn(List<String> values) {
            addCriterion("diffucultLevel in", values, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelNotIn(List<String> values) {
            addCriterion("diffucultLevel not in", values, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelBetween(String value1, String value2) {
            addCriterion("diffucultLevel between", value1, value2, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andDiffucultLevelNotBetween(String value1, String value2) {
            addCriterion("diffucultLevel not between", value1, value2, "diffucultLevel");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Integer value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Integer value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Integer value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Integer value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Integer value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Integer> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Integer> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Integer value1, Integer value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Integer value1, Integer value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andBigEptIsNull() {
            addCriterion("bigEpt is null");
            return (Criteria) this;
        }

        public Criteria andBigEptIsNotNull() {
            addCriterion("bigEpt is not null");
            return (Criteria) this;
        }

        public Criteria andBigEptEqualTo(Integer value) {
            addCriterion("bigEpt =", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptNotEqualTo(Integer value) {
            addCriterion("bigEpt <>", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptGreaterThan(Integer value) {
            addCriterion("bigEpt >", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigEpt >=", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptLessThan(Integer value) {
            addCriterion("bigEpt <", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptLessThanOrEqualTo(Integer value) {
            addCriterion("bigEpt <=", value, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptIn(List<Integer> values) {
            addCriterion("bigEpt in", values, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptNotIn(List<Integer> values) {
            addCriterion("bigEpt not in", values, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptBetween(Integer value1, Integer value2) {
            addCriterion("bigEpt between", value1, value2, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andBigEptNotBetween(Integer value1, Integer value2) {
            addCriterion("bigEpt not between", value1, value2, "bigEpt");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("`time` not between", value1, value2, "time");
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

        public Criteria andParticipateNumIsNull() {
            addCriterion("participateNum is null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumIsNotNull() {
            addCriterion("participateNum is not null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumEqualTo(Integer value) {
            addCriterion("participateNum =", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotEqualTo(Integer value) {
            addCriterion("participateNum <>", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumGreaterThan(Integer value) {
            addCriterion("participateNum >", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("participateNum >=", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumLessThan(Integer value) {
            addCriterion("participateNum <", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumLessThanOrEqualTo(Integer value) {
            addCriterion("participateNum <=", value, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumIn(List<Integer> values) {
            addCriterion("participateNum in", values, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotIn(List<Integer> values) {
            addCriterion("participateNum not in", values, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumBetween(Integer value1, Integer value2) {
            addCriterion("participateNum between", value1, value2, "participateNum");
            return (Criteria) this;
        }

        public Criteria andParticipateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("participateNum not between", value1, value2, "participateNum");
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