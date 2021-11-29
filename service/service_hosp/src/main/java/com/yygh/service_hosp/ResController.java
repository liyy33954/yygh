package com.yygh.service_hosp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RefreshScope
public class ResController {
    @Value("${user.userName}")
    String userName;
    @RequestMapping(value="/login")
    public String clsj(@RequestParam(defaultValue = "${user.age}") String userName) {

        System.out.println(userName);
        return userName;

    }

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i =0 ; i<100;i++){
            list.add(i);
        }
        long count = list.stream().filter(i -> {
//            System.out.println("foreach");
            return i % 3 == 1;
        }).count();
        System.out.println(count);
        Set<Integer> collect = list.stream().filter(v->v%3==1).collect(Collectors.toSet());
        System.out.println(collect);
        assert list==collect;

        System.out.println(Stream.of("a", "b", "c").map(v -> v.toUpperCase()).collect(Collectors.toSet()));
    }
}
