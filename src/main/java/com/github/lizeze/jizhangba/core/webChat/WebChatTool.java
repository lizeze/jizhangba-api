package com.github.lizeze.jizhangba.core.webChat;

import com.github.lizeze.jizhangba.core.http.HttpTool;
import org.apache.http.client.methods.HttpGet;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.core.webChat
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:46
 * @Description: ${Description}
 */
public class WebChatTool {


    public static String login(String jsCode) {

        String str = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
        String url = String.format(str, "wxa8972e6945314e7d", "d38c83426e9315e6cf0d5522fd7e2cbc", jsCode);
        return HttpTool.sendGet(url, null);
    }
}
