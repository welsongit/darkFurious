package cn.darkFurious.service;

import cn.darkFurious.entity.Account;

/**
 * 登录业务逻辑层接口
 * @author 001
 *
 */
public interface LoginService {

	boolean checkAccount(Account account);

}
