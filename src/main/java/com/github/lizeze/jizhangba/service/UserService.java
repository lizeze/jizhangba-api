package com.github.lizeze.jizhangba.service;

import com.github.lizeze.jizhangba.core.webChat.WebChatTool;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.service
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:10
 * @Description: ${Description}
 */
@Service
public class UserService {


    public String login(String jsCode) {

        return WebChatTool.login(jsCode);
    }


}
