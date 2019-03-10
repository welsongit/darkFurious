package cn.darkFurious.mapper;

import org.apache.ibatis.annotations.Param;

import cn.darkFurious.entity.Account;

public interface LoginMapper {

	String checkAccount(@Param("account") Account account);

}
