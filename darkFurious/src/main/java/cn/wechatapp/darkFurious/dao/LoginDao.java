package cn.wechatapp.darkFurious.dao;

import org.apache.ibatis.annotations.Param;

import cn.wechatapp.darkFurious.entity.Account;

public interface LoginDao {

	String checkAccount(@Param("account") Account account);

}
