package com.juzhai.future.passport.model;

import java.io.Serializable;
import java.util.Date;

public class TpUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.uid
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.tp_id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Long tpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.tp_identity
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String tpIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.auth_info
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private String authInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tp_user.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_tp_user
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.id
     *
     * @return the value of tb_tp_user.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.id
     *
     * @param id the value for tb_tp_user.id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.uid
     *
     * @return the value of tb_tp_user.uid
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.uid
     *
     * @param uid the value for tb_tp_user.uid
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.tp_id
     *
     * @return the value of tb_tp_user.tp_id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Long getTpId() {
        return tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.tp_id
     *
     * @param tpId the value for tb_tp_user.tp_id
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.tp_identity
     *
     * @return the value of tb_tp_user.tp_identity
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getTpIdentity() {
        return tpIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.tp_identity
     *
     * @param tpIdentity the value for tb_tp_user.tp_identity
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setTpIdentity(String tpIdentity) {
        this.tpIdentity = tpIdentity == null ? null : tpIdentity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.auth_info
     *
     * @return the value of tb_tp_user.auth_info
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public String getAuthInfo() {
        return authInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.auth_info
     *
     * @param authInfo the value for tb_tp_user.auth_info
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo == null ? null : authInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.create_time
     *
     * @return the value of tb_tp_user.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.create_time
     *
     * @param createTime the value for tb_tp_user.create_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tp_user.last_modify_time
     *
     * @return the value of tb_tp_user.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tp_user.last_modify_time
     *
     * @param lastModifyTime the value for tb_tp_user.last_modify_time
     *
     * @mbggenerated Fri Mar 22 11:01:10 CST 2013
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}