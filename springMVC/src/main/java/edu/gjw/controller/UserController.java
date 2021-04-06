package edu.gjw.controller;

import edu.gjw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(path = "/toinsert")
    public String toInsert(){
        return "insert";
    }
    @RequestMapping("/toinsertUser")
    public String insertUser(User user, Model model){
        model.addAttribute("name",user.getName());
        model.addAttribute("password",user.getPassword());
        return "login";
    }
    @RequestMapping(path = "/tologin")
    public String login(String name,String password,Model model){
        if("admin".equals(name)&&"123".equals(password)){
            model.addAttribute("success","登录成功");
        return "index";}
        else{
            return "login";
        }
    }
}
