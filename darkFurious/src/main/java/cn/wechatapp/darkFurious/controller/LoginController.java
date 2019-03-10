package cn.wechatapp.darkFurious.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wechatapp.darkFurious.entity.Account;
import cn.wechatapp.darkFurious.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/index")
	private String index() {
		return "login";
	}
	
	@RequestMapping("/checkAccount")
	private String login(Account account) {
		Boolean flag = loginService.checkAccount(account);
		log.info("登录账号密码验证结果={}", flag);
		if(flag) {
			return "html/editArticle";
		}
		return "login";
	}
}
