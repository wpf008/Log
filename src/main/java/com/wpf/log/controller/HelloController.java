package com.wpf.log.controller;

import com.wpf.log.annotation.BussinessLog;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:49 2018/6/12
 * @Modified by
 */
@RestController
public class HelloController {

    @BussinessLog(value ="save user",dict = "HelloController save" ,key = "name")
    @GetMapping("/save/{name}")
    public String save(@PathVariable("name")String name){
        return name;
    }

}
