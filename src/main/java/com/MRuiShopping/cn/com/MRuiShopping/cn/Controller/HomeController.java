package com.MRuiShopping.cn.com.MRuiShopping.cn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("home")
    public  String index(Model model){
         model.addAttribute("name" ,"罗明");

        return "Home/home";
    }
}
