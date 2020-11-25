package com.github.lizeze.jizhangba.api;

import com.github.lizeze.jizhangba.model.UserModel;
import com.github.lizeze.jizhangba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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


    //    @GetMapping("/login/{jsCode}")
    //    public ResponseEntity userLogin(@PathVariable("jsCode") String jsCode) {
    //
    //        String acctssToken = userService.login(jsCode);
    //
    //        return ResponseEntity.status(HttpStatus.OK).body(acctssToken);
    //
    //    }

    @PostMapping("/accesstoken")
    public ResponseEntity userLogin(@RequestBody UserModel userModel) {

        Map<String, String> map = userService.MakeToken(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
