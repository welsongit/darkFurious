package cn.wechatapp.darkFurious.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wechatapp.darkFurious.entity.Account;
import cn.wechatapp.darkFurious.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/checkAccount")
	private String login(Account account) {
		if(loginService.checkAccount(account)) {
			return "Y";
		}
		return "N";
	}
}
