package cn.darkFurious.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.darkFurious.entity.Account;
import cn.darkFurious.mapper.LoginMapper;
import cn.darkFurious.service.LoginService;

/**
 * 登录业务逻辑层实现类
 * @author 001
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public boolean checkAccount(Account account) {
		return "Y".equals(loginMapper.checkAccount(account)) ? true : false ;
	}

}
