package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author:Zbei
 * @date:2020.03.10 17:25
 */
@RestController
public class Controller {
    @Autowired
    private RedisTemplate redisTemplate;
     private int i;
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        redisTemplate.opsForValue().set("student",student);
        System.out.println("sucuess");
    }
    @GetMapping("/get/{student}")
    public Student get(@PathVariable("student") String stu){
        Student o = (Student)redisTemplate.opsForValue().get(stu);
        return o;
    }

    @DeleteMapping("/delete/{student}")
    public void delete(@PathVariable("student")String stu){
        redisTemplate.delete(stu);
    }
}
