package com.github.lizeze.jizhangba.api;

import com.github.lizeze.jizhangba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: jizhangba
 * @BelongsPackage: com.github.lizeze.jizhangba.api
 * @Author: lizeze
 * @CreateTime: 2020-11-22 21:59
 * @Description: ${Description}
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/login/{jsCode}")
    public ResponseEntity userLogin(@PathVariable("jsCode") String jsCode) {

        String acctssToken = userService.login(jsCode);

        return ResponseEntity.status(HttpStatus.OK).body(acctssToken);

    }
}
