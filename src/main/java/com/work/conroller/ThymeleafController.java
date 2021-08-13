package com.work.conroller;

import com.work.bean.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author peacoke
 * @date 2021/8/11
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/account")
    public String index(Model model) {
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("KangKang", "康康", "e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
        list.add(new Account("Mike", "麦克", "e10adc3949ba59abbe56e", "管理员", "13444444444"));
        list.add(new Account("Jane","简","e10adc3949ba59abbe56e","运维人员","18666666666"));
        list.add(new Account("Maria", "玛利亚", "e10adc3949ba59abbe56e", "清算人员", "19999999999"));
        model.addAttribute("accountList",list);
        return "account";
    }

}
