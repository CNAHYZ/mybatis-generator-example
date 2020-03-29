package entity;

import java.util.Date;

/**
 * 用户基本信息表
 *
 * @author yz
 * @date 2020/03/26
 */
public class UserInfo {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 考场id
     */
    private String siteId;

    /**
     * 小程序unionid
     */
    private String unionid;

    /**
     * openid
     */
    private String openid;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户手机号
     */
    private String msisdn;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 省份
     */
    private String province;

    /**
     * 地市
     */
    private String city;

    /**
     * 最近登录时间
     */
    private Date lastLoginTime;

    /**
     * 首次注册时间
     */
    private Date firstRegstTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn == null ? null : msisdn.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getFirstRegstTime() {
        return firstRegstTime;
    }

    public void setFirstRegstTime(Date firstRegstTime) {
        this.firstRegstTime = firstRegstTime;
    }
}