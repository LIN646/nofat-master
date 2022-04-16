package com.nofat.utils;


import sun.security.ssl.SSLSocketFactoryImpl;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by xsir on 2020/5/20.
 *
 * @author xsir
 * @date 2020/5/20
 */
public class WeChatUtil {
    private String appId;
    private String appSecret;


    public String request(String requestUrl, String requestMethod) {
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(requestUrl);
            // 打开连接
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            // 设置请求方法
            connection.setRequestMethod(requestMethod);
            // 设置请求内容的类型
            connection.setRequestProperty("Content-Type", "application/json");
            //必须设置false，否则会自动redirect到重定向后的地址
            connection.setInstanceFollowRedirects(false);
            // 连接
            connection.connect();
            // 获取字节输入流
            InputStream in = connection.getInputStream();
            // 把字节输入流转换成字符输入流
            InputStreamReader inr = new InputStreamReader(in, Charset.forName("utf-8"));

            // 创建字符读取流的缓冲区对象
            BufferedReader bufferedReader = new BufferedReader(inr);

            String str;
            // 每次读取一行
            while ((str = bufferedReader.readLine()) != null) {
                result.append(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 返回结果字符串
        return result.toString();
    }


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
        return "WeChatUtil{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
