package com.github.lizeze.jizhangba.api;

import com.github.lizeze.jizhangba.model.BillModel;
import com.github.lizeze.jizhangba.service.BillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.api
 * @Author: lizeze
 * @CreateTime: 2020-11-22 11:15
 * @Description: ${Description}
 */
@RestController
@RequestMapping("/api/bill")
public class BillController {


    @Autowired
    private BillServiceImpl service;


    @PostMapping("/")
    public ResponseEntity addModel(@RequestBody BillModel billModel) {


        billModel = service.addModel(billModel);

        return ResponseEntity.status(HttpStatus.OK).body(billModel);
    }

}
