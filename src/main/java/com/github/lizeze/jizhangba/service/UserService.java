package com.github.lizeze.jizhangba.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.lizeze.jizhangba.core.jwt.JwtToken;
import com.github.lizeze.jizhangba.core.webChat.WebChatTool;
import com.github.lizeze.jizhangba.mapper.UserrMapper;
import com.github.lizeze.jizhangba.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.service
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:10
 * @Description: ${Description}
 */
@Service
public class UserService {

    @Autowired
    private UserrMapper userrMapper;

    public String login(String jsCode) {

        return WebChatTool.login(jsCode);
    }


    public Map<String, String> MakeToken(UserModel userModel) {

        QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("unionid", userModel.getUnionId());
        UserModel userData = userrMapper.selectOne(queryWrapper);
        if (userData == null) {
            userData = userModel;
            userData.setCreateTime(new Date());
            userrMapper.insert(userData);
        }
        String accessToken = JwtToken.makeToken(userData.getUserId(), "xiaotaideng", 1000 * 60 * 60 * 2);

        Map<String, String> map = new HashMap<>();
        map.put("userId", userData.getUserId());
        map.put("accessToken", accessToken);
        return map;
    }


}
