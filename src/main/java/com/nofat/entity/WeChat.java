package com.nofat.entity;

/**
 * Created by xsir on 2020/5/19.
 *
 * @author xsir
 * @date 2020/5/19
 */
public class WeChat {
    private String appId;
    private String appSecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Override
    public String toString() {
        return "WeChat{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
