package cn.wechatapp.darkFurious.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wechatapp.darkFurious.dao.LoginDao;
import cn.wechatapp.darkFurious.entity.Account;
import cn.wechatapp.darkFurious.service.LoginService;

/**
 * 登录业务逻辑层实现类
 * @author 001
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean checkAccount(Account account) {
		return "Y".equals(loginDao.checkAccount(account)) ? true : false ;
	}

}
