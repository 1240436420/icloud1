package com.icss.controller;

import com.icss.domain.User;
import com.icss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/all")
    public List<User> findAll(){
        return userService.findAll();
    }
   @GetMapping("/user/login")
    public ModelAndView toLogin(){
       ModelAndView model=new ModelAndView();
       model.setViewName("login");
       return model;
   }

    @GetMapping("/user/index")
    public ModelAndView toIndex(){
        ModelAndView model=new ModelAndView();
        model.setViewName("index");
        return model;
    }
    @GetMapping("/user/write")
    public ModelAndView toWrite(){
        ModelAndView model=new ModelAndView();
        model.setViewName("write");
        return model;
    }
    @GetMapping("/user/register")
    public ModelAndView toRegister(){
        ModelAndView model=new ModelAndView();
        model.setViewName("register");
        return model;
    }
    @PostMapping("/user/successregister")
    public String successregister(String emailphone,String password){
        User user=new User();
        user.setEmailphone(emailphone);
        user.setPassword(password);
       if(userService.insertUser(user)){
           return "注册成功";
       }else{
          return "注册失败";
       }


    }

    @PostMapping("/user/successlogin")
    public String successlogin(String emailphone,String password){
        System.out.println(emailphone+"------------------"+password);
        List<User> users=userService.findAll();
        for(User user:users){
            String ep=user.getEmailphone();
            String pw=user.getPassword();
            if(ep.equals(emailphone) && pw.equals(password)){
               return "登录成功";
            }else{
                return "登录失败";
            }

        }
        return "";
    }


}