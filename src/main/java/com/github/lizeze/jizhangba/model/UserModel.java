package com.github.lizeze.jizhangba.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.model
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:12
 * @Description: ${Description}
 */
@TableName("user_info")
@Getter
@Setter
public class UserModel {


    @TableId
    @TableField("user_id")
    private String userId;
    @TableField("openid")
    private String openid;
    @TableField("nick_name")
    private String nickName;
    @TableField("gender")
    private Integer gender;
    @TableField("province")
    private String province;
    @TableField("country")
    private String country;
    @TableField("city")
    private String city;


}
