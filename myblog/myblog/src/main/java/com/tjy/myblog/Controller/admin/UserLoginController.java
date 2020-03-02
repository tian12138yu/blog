package com.tjy.myblog.Controller.admin;

import com.tjy.myblog.Service.ServiceImpl.UserLoginServiceImpl;
import com.tjy.myblog.Service.UserLoginService;
import com.tjy.myblog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @Author tjy
 * @Date 2020/2/29 19:51
 */
@Controller
@RequestMapping("/admin")
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;

    @GetMapping()
    public String login(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String check(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        User user=userLoginService.chechUser(username,password);
        if(user!=null){
            user.setPassword(null);
            session.setAttribute("user",user);
            return "admin/index";
        }else{
            attributes.addFlashAttribute("message", "用户名和密码错误");
            return "redirect:/admin";
        }

    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}
