package com.briup.apps.poll.bean;

public class Clazz {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_clazz.id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_clazz.name
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_clazz.grade_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    private Long gradeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_clazz.charge_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    private Long chargeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_clazz.description
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_clazz.id
     *
     * @return the value of poll_clazz.id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_clazz.id
     *
     * @param id the value for poll_clazz.id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_clazz.name
     *
     * @return the value of poll_clazz.name
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_clazz.name
     *
     * @param name the value for poll_clazz.name
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_clazz.grade_id
     *
     * @return the value of poll_clazz.grade_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_clazz.grade_id
     *
     * @param gradeId the value for poll_clazz.grade_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_clazz.charge_id
     *
     * @return the value of poll_clazz.charge_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public Long getChargeId() {
        return chargeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_clazz.charge_id
     *
     * @param chargeId the value for poll_clazz.charge_id
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_clazz.description
     *
     * @return the value of poll_clazz.description
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_clazz.description
     *
     * @param description the value for poll_clazz.description
     *
     * @mbg.generated Wed Jun 27 08:43:11 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}