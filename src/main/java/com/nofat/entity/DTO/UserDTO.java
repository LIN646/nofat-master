package com.nofat.entity.DTO;

import com.nofat.entity.DO.UserDO;

/**
 * Created by xsir on 2020/5/19.
 *
 * @author xsir
 * @date 2020/5/19
 */
public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String wx;
    private String sex;
    private String birthday;
    private String avatar;
    private String intro;
    private Integer coin;
    public String location;

    public UserDTO() {

    }

    public UserDTO(UserDO userDo) {
        this.id = userDo.getId();
        this.wx = userDo.getWx();
        this.name = userDo.getName();
        this.coin = userDo.getCoin();
        this.email = userDo.getEmail();
        this.intro = userDo.getIntro();
        this.phone = userDo.getPhone();
        this.avatar = userDo.getAvatar();
        this.birthday = userDo.getBirthday();
        this.location = userDo.getLocation();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
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
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", wx='" + wx + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", avatar='" + avatar + '\'' +
                ", intro='" + intro + '\'' +
                ", coin=" + coin +
                ", location='" + location + '\'' +
                '}';
    }
}
