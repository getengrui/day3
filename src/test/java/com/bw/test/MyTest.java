package com.bw.test;

import com.bw.bean.Goods;
import com.bw.utils.IOToFileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext-redis.xml")
public class MyTest {
    @Resource
    private RedisTemplate<String,Goods> redisTemplate;
    @Test
    public void test(){
        List<String> strings = IOToFileUtils.readFileByLinesList("D:\\ideaworkspace\\day3\\src\\test\\resources\\test.txt");
                    redisTemplate.delete("goodsList");
        BoundListOperations<String, Goods> goodslist = redisTemplate.boundListOps("goodsList");

        for (String string : strings) {
            String[] split = string.split("==");
            String str1 = split[0];
            String gname = split[1];
            String str3 = split[2];
            double bfb=0;
            if (split.length==4){
                String str4 = split[3];
                bfb = Double.parseDouble(str4.replace("%", ""));
            }


            int gid = Integer.parseInt(str1);
            double price = Double.parseDouble(str3.replace("¥",""));

            Goods goods = new Goods(gid, gname, price, bfb);
//            System.out.println(goods);
             goodslist.rightPush(goods);

        }
    }
}
