package com.zz.controller;

import com.zz.exception.UserNotExistException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {

        throw new UserNotExistException(id);
    }
    @GetMapping("error2")
    public void get2() {
//        try{
            int a=1/0;
//        }catch (ArithmeticException e){
//            System.out.println("异常信息："+e.getMessage());
//        }

        System.out.println("异常后面的代码***************");
    }
}
