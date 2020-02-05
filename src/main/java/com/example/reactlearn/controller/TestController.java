package com.example.reactlearn.controller;


import com.alibaba.fastjson.JSON;
import com.example.reactlearn.model.*;
import com.example.reactlearn.util.IdUtil;
import com.example.reactlearn.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {



    @PostMapping("/api/homehot1")
    public String homehot1(String city){
        System.out.println(city);
        List<Homehot> homehotList = new ArrayList<>();
        for (int i =0; i<3; i++){
            Homehot homehot1 = new Homehot();
            homehot1.setId(IdUtil.getId());
            homehot1.setTitle("落地灯");
            homehot1.setImg("https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg");
            homehotList.add(homehot1);
        }
        return JSON.toJSONString(homehotList);
    }

    @PostMapping("/api/homehot2")
    public String homehot2(String city){
        System.out.println(city);
        List<Homehot> homehotList = new ArrayList<>();
        for (int i =0; i<3; i++){
            Homehot homehot1 = new Homehot();
            homehot1.setId(IdUtil.getId());
            homehot1.setTitle("落地灯");
            homehot1.setImg("https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg");
            homehotList.add(homehot1);
        }
        return JSON.toJSONString(homehotList);
    }

    @PostMapping("/api/search")
    public String search(String city,String content,Integer page){
        System.out.println(page);
        List<Search> searchList = new ArrayList<>();
        for (int i =0; i<5; i++){
            Search search = new Search();
            search.setId(IdUtil.getId());
            search.setTitle("豪宅 ▪ 使馆壹号3居室");
            search.setHouseType("237 m2| 2/30层| 2室1厅");
            search.setPrice("<p>"+80000+i+"</p>");
            search.setRentType("整租");
            search.setImg("http://gtd.alicdn.com/tfscom/TB1r.aQKhGYBuNjy0FnSut5lpXa");
            search.setHasMore(true);
            searchList.add(search);
        }
        return JSON.toJSONString(searchList);
    }

    @PostMapping("/api/details")
    public String details(String id){
        Info info = new Info();
        info.setYears("2002年");
        info.setType("4室1厅");
        info.setLevel("17/19层");
        info.setStyle("精装修");
        info.setOrientation("朝南");

        String[] imgs ={
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg",
                "https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg"
        };
        Details details = new Details();
        details.setImgs(imgs);
        details.setTitle("豪宅·使馆壹号4居室-南");
        details.setPrice("1300000");
        details.setRentType("整租");
        details.setHouseType("273.97m²");
        details.setInfo(info);

        return JSON.toJSONString(details);
    }

    @PostMapping("/api/comment")
    public String getComments(String id){
        List<Comment> commentList = new ArrayList<>();
        for (int i =0;i<5;i++){
            Comment comment = new Comment();
            comment.setUsername("吉村富浪");
            comment.setComment(i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i);
            comment.setStar(5);
            comment.setHasMore(true);
            commentList.add(comment);
        }
        return JSON.toJSONString(commentList);
    }

    @PostMapping("/api/car")
    public String shopcar(String id){
        List<Order> orderList = new ArrayList<>();
        for (int i =0;i<3;i++){
            Order order = new Order();
            order.setId(IdUtil.getId());
            order.setImg("https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg");
            order.setTitle("豪宅·使馆壹号4居室-南");
            order.setPrice("1300000");
            order.setRentType("整租");
            order.setHouseType("273.97m²");
            order.setCommentState(0);
            orderList.add(order);


            Order order2 = new Order();
            order2.setId(IdUtil.getId());
            order2.setImg("https://pic1.ajkimg.com/display/xinfang/b5eb33738d058a7eae3100ff4bd03e26/840x563.jpg");
            order2.setTitle("豪宅·使馆壹号4居室-南");
            order2.setPrice("1300000");
            order2.setRentType("整租");
            order2.setHouseType("273.97m²");
            order2.setCommentState(2);
            orderList.add(order2);
        }
        return JSON.toJSONString(orderList);
    }

    @PostMapping("/api/ordercomment")
    //测试分支操作1239991
    public String ordercommentData(String info) {
        Map<String,String> result = new HashMap<>();
        result.put("msg",info);
        return JSON.toJSONString(result);
    }
}
