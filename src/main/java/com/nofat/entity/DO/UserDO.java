package com.nofat.entity.DO;

import java.io.Serializable;
import java.sql.Date;


public class UserDO implements Serializable{
    private Integer id;
    private Integer typeId;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String wx;
    private String sex;
    private String birthday;
    private String avatar;
    private String intro;
    private Integer coin;
    public String location;
    private Date createTime;
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "".equals(name) ? null : name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = "".equals(password) ? null : password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = "".equals(email) ? null : email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = "".equals(phone) ? null : phone;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = "".equals(wx) ? null : wx;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = "".equals(sex) ? null : sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = "".equals(birthday) ? null : birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = "".equals(avatar) ? null : avatar;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = "".equals(intro) ? null : intro;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = "".equals(location) ? null : location;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", wx='" + wx + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", avatar='" + avatar + '\'' +
                ", intro='" + intro + '\'' +
                ", coin=" + coin +
                ", location='" + location + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
