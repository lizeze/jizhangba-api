package com.github.lizeze.jizhangba.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.model
 * @Author: lizeze
 * @CreateTime: 2020-11-22 11:10
 * @Description: ${Description}
 */
@TableName("bill_data")
@Getter
@Setter
public class BillModel {


    @TableId(type = IdType.ASSIGN_ID)
    @TableField("bill_id")
    private String billId;


    @TableField("bill_amount")
    private String billAmount;


    @TableField("bill_time")
    private Date billTime;


    @TableField("bill_remark")
    private String billRemark;

    @TableField("bill_create_time")
    private Date billcreateTime;

    @TableField("bill_type")
    private String billType;

    @TableField("user_id")
    private String userId;
}
