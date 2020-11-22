package com.github.lizeze.jizhangba.service;

import com.github.lizeze.jizhangba.mapper.BillMapper;
import com.github.lizeze.jizhangba.model.BillModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.service
 * @Author: lizeze
 * @CreateTime: 2020-11-22 11:14
 * @Description: ${Description}
 */
@Service
public class BillServiceImpl {

    @Autowired
    private BillMapper billMapper;


    public BillModel addModel(BillModel billModel) {

        billModel.setBillcreateTime(new Date());
        billMapper.insert(billModel);

        return billModel;
    }

}
