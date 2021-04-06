package edu.gjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goto")
public class Controller1 {
    @RequestMapping(path = "/annocation")
    public String annocation(Model model) {
        model.addAttribute("msg", "this is jsp");
        return "success";
    }

    @RequestMapping(path = "/userlist")
    public String userList(Model model) {
        List<String> list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add("user" + i);
        }
        model.addAttribute("list", list);
        return "index";
    }
    /*1.通过request获取参数的方式进行数据绑定*/
/*    @RequestMapping(path = "/tovalue")
    public String tovalue(HttpServletRequest request){
    String id=request.getParameter("id");
    System.out.println(id);//输出到控制台
        return "success";
    }
}*/
    //2.方法参数与页面参数名称一致//最常用的方法
   /* @RequestMapping(path = "/tovalue")
    public String toValue(Integer id){
        System.out.println(id);
        return "success";
    }*/
    //3.利用注解将页面值与当前自定义对象进行绑定
    @RequestMapping(path = "/tovalue")
    public String toValue(@RequestParam(value = "id") Integer user_id){
        System.out.println(user_id);
        return "success";
    }
}
