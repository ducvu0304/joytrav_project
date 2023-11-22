package com.joytrav.controller;

import com.joytrav.model.Account;
import com.joytrav.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/admin")
    public String adminPage(Model model) {
        List<Account> accountList = accountService.fetchALl();
        model.addAttribute("accountList", accountList);
        return "admin";
    }

    @GetMapping("/manage-tour")
    public String tourPage(Model model) {
        return "admin/tour-management";
    }

//    @GetMapping("/")
//    public String adminPage(Model model) {
//        List<Account> accountList = accountService.fetchALl();
//        model.addAttribute("accountList", accountList);
//        return "admin";
//    }
}
