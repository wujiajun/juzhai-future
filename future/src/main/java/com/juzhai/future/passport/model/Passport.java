package com.juzhai.future.passport.model;

import java.io.Serializable;
import java.util.Date;

public class Passport implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.login_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.email
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.email_active
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Boolean emailActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.password
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.admin
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Boolean admin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.device_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String deviceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.last_login_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_passport.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_passport
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.id
     *
     * @return the value of tb_passport.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.id
     *
     * @param id the value for tb_passport.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.login_name
     *
     * @return the value of tb_passport.login_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.login_name
     *
     * @param loginName the value for tb_passport.login_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.email
     *
     * @return the value of tb_passport.email
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.email
     *
     * @param email the value for tb_passport.email
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.email_active
     *
     * @return the value of tb_passport.email_active
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Boolean getEmailActive() {
        return emailActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.email_active
     *
     * @param emailActive the value for tb_passport.email_active
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setEmailActive(Boolean emailActive) {
        this.emailActive = emailActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.password
     *
     * @return the value of tb_passport.password
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.password
     *
     * @param password the value for tb_passport.password
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.admin
     *
     * @return the value of tb_passport.admin
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.admin
     *
     * @param admin the value for tb_passport.admin
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.device_name
     *
     * @return the value of tb_passport.device_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.device_name
     *
     * @param deviceName the value for tb_passport.device_name
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.last_login_time
     *
     * @return the value of tb_passport.last_login_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.last_login_time
     *
     * @param lastLoginTime the value for tb_passport.last_login_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.create_time
     *
     * @return the value of tb_passport.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.create_time
     *
     * @param createTime the value for tb_passport.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_passport.last_modify_time
     *
     * @return the value of tb_passport.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_passport.last_modify_time
     *
     * @param lastModifyTime the value for tb_passport.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}