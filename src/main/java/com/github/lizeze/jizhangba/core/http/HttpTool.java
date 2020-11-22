package com.github.lizeze.jizhangba.core.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.core.http
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:48
 * @Description: ${Description}
 */
public class HttpTool {


    public static String sendGet(String url, Map<String, String> headers) {
        if (headers == null) headers = new HashMap<>();

        HttpClient httpClient = new DefaultHttpClient();

        // get method
        HttpGet httpGet = new HttpGet(url);

        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpGet.setHeader(entry.getKey(), entry.getValue());

        }

        //response
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //get response into String
        String temp = "";
        try {
            HttpEntity entity = response.getEntity();
            temp = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return temp;


    }
}
