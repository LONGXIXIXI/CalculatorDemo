package com.shaoyi.calculatordemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {

    @RequestMapping("/sum")
    public String sum(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            return "参数输入错误";
        }

        Integer sum = num1 + num2;
        return "结果为：" + sum;
    }
}
