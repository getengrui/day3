package com.bw.controller;

import com.bw.bean.Goods;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author DELL
 */
@Controller
public class GoodsController {

    @Resource
    private RedisTemplate<String, Goods> redisTemplate;

    @RequestMapping("list")
    public String list(){

        return "list";
    }
}
